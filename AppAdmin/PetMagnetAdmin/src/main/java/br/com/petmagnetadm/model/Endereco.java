package br.com.petmagnetadm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Endereco {

	private char logradouro;

	private char numero;

	private char bairro;

	private char cidade;

	private char UF;

	private char pais;

	private char CEP;

	private Geolocalizacao geolocalizacao;
}
