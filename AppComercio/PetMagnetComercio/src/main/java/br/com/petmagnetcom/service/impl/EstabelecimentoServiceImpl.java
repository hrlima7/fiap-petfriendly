package br.com.petmagnetcom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.petmagnetcom.model.Estabelecimento;
import br.com.petmagnetcom.repository.EstabelecimentoRepository;
import br.com.petmagnetcom.service.EstabelecimentoService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EstabelecimentoServiceImpl implements EstabelecimentoService {
	@Autowired
	EstabelecimentoRepository repository;
	
	@Override
	public Estabelecimento inserir(Estabelecimento obj) {
		return repository.save(obj);
	}

	@Override
	public Estabelecimento alterar(Estabelecimento obj) {
		return repository.save(obj);
	}

	@Override
	public Estabelecimento excluir(Integer id) {
		Estabelecimento e = repository.findById(id).get();
		repository.deleteById(id);
		return e;
	}

	@Override
	public Estabelecimento consultarPorId(Integer id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Estabelecimento> consultarTodos() {
		return repository.findAll();
	}
}
