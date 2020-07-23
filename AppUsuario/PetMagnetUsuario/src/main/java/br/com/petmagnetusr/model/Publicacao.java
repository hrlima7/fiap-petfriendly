package br.com.petmagnetusr.model;

public class Publicacao {
	private Estabelecimento Estabelecimento;

	private Anuncio Anuncio;

	public Publicacao() {
		super();
	}

	public Publicacao(br.com.petmagnetusr.model.Estabelecimento estabelecimento,
			br.com.petmagnetusr.model.Anuncio anuncio) {
		super();
		Estabelecimento = estabelecimento;
		Anuncio = anuncio;
	}

	public Estabelecimento getEstabelecimento() {
		return Estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		Estabelecimento = estabelecimento;
	}

	public Anuncio getAnuncio() {
		return Anuncio;
	}

	public void setAnuncio(Anuncio anuncio) {
		Anuncio = anuncio;
	}	
}
