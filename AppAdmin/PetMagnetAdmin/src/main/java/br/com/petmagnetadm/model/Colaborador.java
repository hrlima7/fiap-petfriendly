package br.com.petmagnetadm.model;

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
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity(name = "T_COLABORADOR")
public class Colaborador {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="SQ_T_COLABORADOR")
	@Column(name = "ID_COLABORADOR")	
	Integer Id;

	@Column(name = "NM_COLABORADOR", length = 60)
	@NotEmpty
	@Min(value = 5)
	@Max(value = 60)
	String nome;

	@Column(name = "CD_MATRICULA", length = 15)
	@NotEmpty
	@Min(value = 1)
	@Max(value = 15)
	String matricula;

	@Column(name = "DS_EMAIL", length = 30)
	@NotEmpty
	@Min(value = 1)
	@Max(value = 30)
	String email;

	@Column(name = "DS_SENHA", length = 30)
	@NotEmpty
	@Min(value = 6)
	@Max(value = 30)
	String senha;
	
	@Column(name = "DT_CRIACAO")
	@CreationTimestamp
	@DateTimeFormat(iso = ISO.DATE, pattern = "dd/MM/yyyy HH:mm:SS")
	@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
	Date dtCriacao;
}
