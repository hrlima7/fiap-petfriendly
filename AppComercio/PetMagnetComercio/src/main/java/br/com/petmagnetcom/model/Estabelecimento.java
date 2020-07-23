package br.com.petmagnetcom.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity(name = "T_ESTABELECIMENTO")
public class Estabelecimento {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="SQ_T_ESTABELEC")
	@Column(name = "ID_ESTABELECIMENTO")
	private int id;
	
	@Column(name = "NM_FANTASIA", length = 60)
	@NotEmpty
	@Min(value = 5)
	@Max(value = 60)
	private String nome;
	
	@Column(name = "NR_CNPJ", length = 20)
	@CNPJ
	@NotEmpty
	private String CNPJ;
	
	@Column(name = "DT_CRIACAO")
	@CreationTimestamp
	@DateTimeFormat(iso = ISO.DATE, pattern = "dd/MM/yyyy HH:mm:SS")
	@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
	private Date dtCriacao;
}
