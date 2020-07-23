package br.com.petmagnetcom.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.petmagnetcom.model.Colaborador;
import br.com.petmagnetcom.model.Login;
import br.com.petmagnetcom.service.impl.ColaboradorServiceImpl;
import br.com.petmagnetcom.service.impl.EstabelecimentoServiceImpl;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("conectar")
public class LoginController {

	@Autowired
	EstabelecimentoServiceImpl estabelecimentoService;
	
	@Autowired
	ColaboradorServiceImpl ColaboradorService;
	
	@GetMapping("")
	public String abrirFormLogin(Login l, Model m) {
		return "login/entrar";
	}
	
	@PostMapping("")
	public String validarAcesso(@Valid Login login, BindingResult r, RedirectAttributes ra) {
		if (r.hasErrors()) {
			return "login/entrar";
		}
		
		Colaborador colaborador = login.validarAcesso(ColaboradorService);
		
		if (colaborador == null) {
			ra.addFlashAttribute("msgerro", "Ops! Usuário ou Senha não Cadastrados.");
			return "redirect:conectar";
		}
		
		return "redirect:estabelecimento";
	}
}
