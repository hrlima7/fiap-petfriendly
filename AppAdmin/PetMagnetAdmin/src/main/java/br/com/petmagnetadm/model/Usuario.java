package br.com.petmagnetadm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity(name = "T_USUARIO")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_usuario")
	Integer id;
	
	@Column(name = "ds_nome")	
	@NotBlank(message = "{campo.obrigatorio}")
	String nome;

	@Column(name = "ds_login")	
	@NotBlank(message = "{campo.obrigatorio}")
	@Email
	String login;

	@Column(name = "ds_senha")	
	@NotBlank(message = "{campo.obrigatorio}")
	String senha;
}
