package br.com.petmagnetadm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Geolocalizacao {
	private char CEP;

	private double latitude;

	private double longitude;

	public Geolocalizacao() {
		super();
	}
}
