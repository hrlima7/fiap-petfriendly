package br.com.petmagnetusr.model;

public class Curtida {
	private Anuncio Anuncio;

	private Usuario Usuario;

	public Curtida() {
		super();
	}

	public Curtida(br.com.petmagnetusr.model.Anuncio anuncio, br.com.petmagnetusr.model.Usuario usuario) {
		super();
		Anuncio = anuncio;
		Usuario = usuario;
	}

	public Anuncio getAnuncio() {
		return Anuncio;
	}

	public void setAnuncio(Anuncio anuncio) {
		Anuncio = anuncio;
	}

	public Usuario getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuario usuario) {
		Usuario = usuario;
	}
}
