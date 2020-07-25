package br.com.petmagnetadm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.petmagnetadm.model.Usuario;
import br.com.petmagnetadm.repository.UsuarioRepository;
import br.com.petmagnetadm.service.UsuarioService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	UsuarioRepository repository;
	
	@Override
	public Usuario inserir(Usuario obj) {
		return repository.save(obj);
	}

	@Override
	public Usuario alterar(Usuario obj) {
		return repository.save(obj);
	}

	@Override
	public Usuario excluir(Integer id) {
		Usuario c = repository.findById(id).get();
		repository.deleteById(id);
		return c;
	}

	@Override
	public Usuario consultarPorId(Integer id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Usuario> consultarTodos() {
		return repository.findAll();
	}

	@Override
	public Usuario consultarPorLoginSenha(String l, String s) {
		return repository.findByLoginAndSenha(l, s);
	}
}
