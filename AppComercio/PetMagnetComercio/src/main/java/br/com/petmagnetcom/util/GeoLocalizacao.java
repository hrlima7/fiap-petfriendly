package br.com.petmagnetcom.util;

import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;

public class GeoLocalizacao {
	GeoApiContext context = null;

	public GeoLocalizacao() {
		context = new GeoApiContext.Builder().apiKey("AIzaSyBjAkdZM8nwR4ctyUZxFsOOoTPuPreb9w8").build();
	}

	public Localizacao getGeoLocalizacao(String CEP) throws ApiException, InterruptedException, IOException, ParseException, org.json.simple.parser.ParseException {
		Localizacao loc = new Localizacao();
		
		GeocodingResult[] results = GeocodingApi.geocode(context, CEP).await();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String json = gson.toJson(results).toString();
		
		if (json.equals("[]")) {
			return loc;
		}
		
        // Converte o JSON para um objeto Java.
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(json);

        // Lê os converte o objeto Java para um objeto JSON.
        JSONArray jsonObject1 = (JSONArray) obj;
        JSONObject jsonObject2 = (JSONObject)jsonObject1.get(0);
        JSONObject jsonObject3 = (JSONObject)jsonObject2.get("geometry");
        JSONObject location = (JSONObject) jsonObject3.get("location");

        // Obtém os valores desejados.
		loc.setLatitude(location.get("lat").toString());
		loc.setLongitude(location.get("lng").toString());

		return loc;
	}
}
