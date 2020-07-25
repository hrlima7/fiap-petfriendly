package br.com.petmagnetadm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.petmagnetadm.model.Usuario;

@Service
public interface UsuarioService {
	public Usuario inserir(Usuario obj);
	public Usuario alterar(Usuario obj);
	public Usuario excluir(Integer id);
	public Usuario consultarPorId(Integer id);
	public List<Usuario> consultarTodos();
	public Usuario consultarPorLoginSenha(String e, String s);
}
