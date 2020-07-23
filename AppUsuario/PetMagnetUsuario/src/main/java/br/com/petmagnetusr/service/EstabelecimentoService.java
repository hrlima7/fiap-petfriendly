package br.com.petmagnetusr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.petmagnetusr.model.Estabelecimento;

@Service
public interface EstabelecimentoService {
	public Estabelecimento inserir(Estabelecimento obj);
	public Estabelecimento alterar(Estabelecimento obj);
	public Estabelecimento excluir(Integer id);
	public Estabelecimento consultarPorId(Integer id);
	public List<Estabelecimento> consultarTodos();
}
