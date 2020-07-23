package br.com.petmagnetusr.model;

public class Endereco {

	private char logradouro;

	private char numero;

	private char bairro;

	private char cidade;

	private char UF;

	private char pais;

	private char CEP;

	private Geolocalizacao geolocalizacao;

	public Endereco() {
		super();
	}

	public Endereco(char logradouro, char numero, char bairro, char cidade, char uF, char pais, char cEP,
			Geolocalizacao geolocalizacao) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		UF = uF;
		this.pais = pais;
		CEP = cEP;
		this.geolocalizacao = geolocalizacao;
	}

	public char getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(char logradouro) {
		this.logradouro = logradouro;
	}

	public char getNumero() {
		return numero;
	}

	public void setNumero(char numero) {
		this.numero = numero;
	}

	public char getBairro() {
		return bairro;
	}

	public void setBairro(char bairro) {
		this.bairro = bairro;
	}

	public char getCidade() {
		return cidade;
	}

	public void setCidade(char cidade) {
		this.cidade = cidade;
	}

	public char getUF() {
		return UF;
	}

	public void setUF(char uF) {
		UF = uF;
	}

	public char getPais() {
		return pais;
	}

	public void setPais(char pais) {
		this.pais = pais;
	}

	public char getCEP() {
		return CEP;
	}

	public void setCEP(char cEP) {
		CEP = cEP;
	}

	public Geolocalizacao getGeolocalizacao() {
		return geolocalizacao;
	}

	public void setGeolocalizacao(Geolocalizacao geolocalizacao) {
		this.geolocalizacao = geolocalizacao;
	}
}
