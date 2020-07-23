package br.com.petmagnetusr.model;

import java.util.Date;

public class Usuario extends Endereco {

	private int id;

	private char nome;

	private char sexo;

	private Date dtNasc;

	private Date dtCriacao;

	private Anuncio anuncio;

	private Pet pet;

	public Usuario() {
		super();
	}

	public Usuario(int id, char nome, char sexo, Date dtNasc, Date dtCriacao, Anuncio anuncio, Pet pet) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.dtNasc = dtNasc;
		this.dtCriacao = dtCriacao;
		this.anuncio = anuncio;
		this.pet = pet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getNome() {
		return nome;
	}

	public void setNome(char nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Date getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}

	public Date getDtCriacao() {
		return dtCriacao;
	}

	public void setDtCriacao(Date dtCriacao) {
		this.dtCriacao = dtCriacao;
	}

	public Anuncio getAnuncio() {
		return anuncio;
	}

	public void setAnuncio(Anuncio anuncio) {
		this.anuncio = anuncio;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}
}
