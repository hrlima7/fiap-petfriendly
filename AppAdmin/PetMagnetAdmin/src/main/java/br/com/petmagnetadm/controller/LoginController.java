package br.com.petmagnetadm.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.petmagnetadm.model.Login;
import br.com.petmagnetadm.model.Usuario;
import br.com.petmagnetadm.service.impl.UsuarioServiceImpl;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("admin")
public class LoginController {

	@Autowired
	UsuarioServiceImpl usuarioService;
	
	@GetMapping("")
	public String abrirFormLogin(Login l, Model m) {
		return "principal/principal";
	}
	
	@PostMapping("")
	public String validarAcesso(@Valid Login login, BindingResult r, RedirectAttributes ra) {
		if (r.hasErrors()) {
			return "login/entrar";
		}
		
		Usuario usuario = login.validarAcesso(usuarioService);
		
		if (usuario == null) {
			ra.addFlashAttribute("msgerro", "Ops! Usuário ou Senha não Cadastrados.");
			return "redirect:conectar";
		}
		
		return "redirect:estabelecimento";
	}
}
