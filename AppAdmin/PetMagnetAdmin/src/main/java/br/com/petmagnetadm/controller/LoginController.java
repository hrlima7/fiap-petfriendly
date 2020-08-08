package br.com.petmagnetadm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.petmagnetadm.model.Login;
import br.com.petmagnetadm.service.impl.UsuarioServiceImpl;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class LoginController {

	@Autowired
	UsuarioServiceImpl usuarioService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/conectar")
	public String abrirFormLogin(Login l, Model m) {
		return "login/entrar";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public String abrirFormPrincipal(Login l, Model m) {
		return "principal/principal";
	}	
	
//	@RequestMapping(method = RequestMethod.GET, value = "admin/login")
//	public String validarAcesso(@Valid Login login, BindingResult r, RedirectAttributes ra) {
//		if (r.hasErrors()) {
//			return "login/entrar";
//		}
//		
//		Usuario usuario = login.validarAcesso(usuarioService);
//		
//		if (usuario == null) {
//			ra.addFlashAttribute("msgerro", "Ops! Usuário ou Senha não Cadastrados.");
//			return "redirect:conectar";
//		}
//		
//		return "redirect:estabelecimento";
//	}
} 
