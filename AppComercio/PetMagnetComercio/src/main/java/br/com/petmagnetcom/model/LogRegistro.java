package br.com.petmagnetcom.model;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class LogRegistro implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@CreatedDate
	@Column(name = "dt_criacao", nullable = false)
	@JsonIgnore
	private Instant dtCriacao = Instant.now();
	
	@LastModifiedDate
	@Column(name = "dt_alteracao", nullable = false)
	@JsonIgnore
	private Instant dtUltimaAlteracao = Instant.now();
}
