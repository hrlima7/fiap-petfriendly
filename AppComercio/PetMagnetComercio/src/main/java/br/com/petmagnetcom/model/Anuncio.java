package br.com.petmagnetcom.model;

import java.util.Date;

public class Anuncio {

	private int id;

	private char chamada;

	private char texto;

	private int imagem;

	private Date dtPublicacao;

	private Date dtValidade;

	private Date dtCriacao;

	public Anuncio() {
		super();
	}

	public Anuncio(int id, char chamada, char texto, int imagem, Date dtPublicacao, Date dtValidade, Date dtCriacao) {
		super();
		this.id = id;
		this.chamada = chamada;
		this.texto = texto;
		this.imagem = imagem;
		this.dtPublicacao = dtPublicacao;
		this.dtValidade = dtValidade;
		this.dtCriacao = dtCriacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getChamada() {
		return chamada;
	}

	public void setChamada(char chamada) {
		this.chamada = chamada;
	}

	public char getTexto() {
		return texto;
	}

	public void setTexto(char texto) {
		this.texto = texto;
	}

	public int getImagem() {
		return imagem;
	}

	public void setImagem(int imagem) {
		this.imagem = imagem;
	}

	public Date getDtPublicacao() {
		return dtPublicacao;
	}

	public void setDtPublicacao(Date dtPublicacao) {
		this.dtPublicacao = dtPublicacao;
	}

	public Date getDtValidade() {
		return dtValidade;
	}

	public void setDtValidade(Date dtValidade) {
		this.dtValidade = dtValidade;
	}

	public Date getDtCriacao() {
		return dtCriacao;
	}

	public void setDtCriacao(Date dtCriacao) {
		this.dtCriacao = dtCriacao;
	}	
}
