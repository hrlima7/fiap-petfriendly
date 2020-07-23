package br.com.petmagnetusr.model;

public class Geolocalizacao {
	private char CEP;

	private double latitude;

	private double longitude;

	public Geolocalizacao() {
		super();
	}

	public Geolocalizacao(char cEP, double latitude, double longitude) {
		super();
		CEP = cEP;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public char getCEP() {
		return CEP;
	}

	public void setCEP(char cEP) {
		CEP = cEP;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
}
