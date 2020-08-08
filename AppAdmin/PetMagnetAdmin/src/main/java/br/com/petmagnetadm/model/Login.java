package br.com.petmagnetadm.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Service;

import br.com.petmagnetadm.service.UsuarioService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Service
public class Login {
	@NotBlank(message = "{campo.obrigatorio}")
	@Email
	String username;
	
	@NotBlank(message = "{campo.obrigatorio}")
	@Size(min = 6, max = 30)
	String password;

	public Usuario validarAcesso(UsuarioService s) {
		return s.consultarPorLoginSenha(this.username, this.password);
	}
}
