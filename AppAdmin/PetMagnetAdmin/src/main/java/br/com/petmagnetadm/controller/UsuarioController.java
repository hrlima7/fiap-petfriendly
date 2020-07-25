package br.com.petmagnetadm.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.petmagnetadm.model.Usuario;
import br.com.petmagnetadm.service.impl.UsuarioServiceImpl;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("usuario")
public class UsuarioController {

	@Autowired
	UsuarioServiceImpl usuarioService;
	
	@GetMapping("cadastrar")
	public String abrirFormCadastro(Usuario usuario, Model model) {
		//m.addAttribute("usuario", UsuarioService.consultarTodos());
		return "usuario/usuario_cadastro";
	}

	@PostMapping("cadastrar")
	/*
	 * Com esta anotação, o spring MVC irá criar automaticamente uma transação e
	 * fará o commit e rollback automaticamente.
	 */
	@Transactional	
	public String cadastrarUsuario(@Valid Usuario usuario, BindingResult result, RedirectAttributes redirect, Model model) {
		if (result.hasErrors()) {
			return "usuario/usuario_cadastro";
		}
		
		try {
			usuarioService.inserir(usuario);
			
		} catch (Exception e) {
			model.addAttribute("msgerro", e.getMessage());
			return "redirect:cadastrar";
		}
		
		redirect.addFlashAttribute("msg", "Usuário cadastrado com Sucesso!");
		return "redirect:cadastrar";
	}
}
