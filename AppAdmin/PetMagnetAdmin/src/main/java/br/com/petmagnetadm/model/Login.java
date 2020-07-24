package br.com.petmagnetadm.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Service;

import br.com.petmagnetadm.service.ColaboradorService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
//@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Service
public class Login {
	@NotBlank(message = "{campo.obrigatorio}")
	@Email
	String usuario;
	
	@NotBlank(message = "{campo.obrigatorio}")
	@Size(min = 6, max = 30)
	String senha;

	public Login(@NotBlank(message = "{campo.obrigatorio}") @Email String usuario,
			@NotBlank(message = "{campo.obrigatorio}") @Size(min = 6, max = 30) String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}	

	public Login() {
		super();
	}	
	
	public Colaborador validarAcesso(ColaboradorService s) {
		return s.consultarPorEmaileSenha(this.usuario, this.senha);
	}
}
