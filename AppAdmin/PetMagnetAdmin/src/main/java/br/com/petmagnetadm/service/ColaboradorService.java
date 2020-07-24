package br.com.petmagnetadm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.petmagnetadm.model.Colaborador;

@Service
public interface ColaboradorService {
	public Colaborador inserir(Colaborador obj);
	public Colaborador alterar(Colaborador obj);
	public Colaborador excluir(Integer id);
	public Colaborador consultarPorId(Integer id);
	public List<Colaborador> consultarTodos();
	public Colaborador consultarPorEmaileSenha(String e, String s);
}
