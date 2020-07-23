package br.com.petmagnetusr.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name = "T_PET_ESTABELECIMENTO")
public class Estabelecimento extends Endereco {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="SQ_T_PET_ESTABEL")
	@Column(name = "ID_ESTABELECIMENTO")
	private int id;
	
	@Column(name = "NM_ESTABELECIMENTO", length = 60)
	private String nome;
	
	@Column(name = "NR_CNPJ", length = 20)
	@CNPJ
	private String CNPJ;
	
	@Column(name = "DT_CRIACAO")
	@CreationTimestamp
	@DateTimeFormat(iso = ISO.DATE, pattern = "dd/MM/yyyy HH:mm:SS")
	@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
	private Date dtCriacao;

	public Estabelecimento() {
		super();
	}

	public Estabelecimento(int id, String nome, String cNPJ, Date dtCriacao) {
		super();
		this.id = id;
		this.nome = nome;
		CNPJ = cNPJ;
		this.dtCriacao = dtCriacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public Date getDtCriacao() {
		return dtCriacao;
	}

	public void setDtCriacao(Date dtCriacao) {
		this.dtCriacao = dtCriacao;
	}
}
