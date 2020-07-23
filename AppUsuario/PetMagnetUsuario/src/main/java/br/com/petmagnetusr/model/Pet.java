package br.com.petmagnetusr.model;

import java.util.Date;

public class Pet {
	private int id;

	private char nome;

	private int especie;

	private int raca;

	private char sexo;

	private Date dtCriacao;

	public Pet() {
		super();
	}

	public Pet(int id, char nome, int especie, int raca, char sexo, Date dtCriacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.especie = especie;
		this.raca = raca;
		this.sexo = sexo;
		this.dtCriacao = dtCriacao;
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

	public int getEspecie() {
		return especie;
	}

	public void setEspecie(int especie) {
		this.especie = especie;
	}

	public int getRaca() {
		return raca;
	}

	public void setRaca(int raca) {
		this.raca = raca;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Date getDtCriacao() {
		return dtCriacao;
	}

	public void setDtCriacao(Date dtCriacao) {
		this.dtCriacao = dtCriacao;
	}
}
