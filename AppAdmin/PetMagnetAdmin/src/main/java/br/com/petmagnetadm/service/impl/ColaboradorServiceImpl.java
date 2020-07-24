package br.com.petmagnetadm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.petmagnetadm.model.Colaborador;
import br.com.petmagnetadm.repository.ColaboradorRepository;
import br.com.petmagnetadm.service.ColaboradorService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ColaboradorServiceImpl implements ColaboradorService {
	@Autowired
	ColaboradorRepository repository;
	
	@Override
	public Colaborador inserir(Colaborador obj) {
		return repository.save(obj);
	}

	@Override
	public Colaborador alterar(Colaborador obj) {
		return repository.save(obj);
	}

	@Override
	public Colaborador excluir(Integer id) {
		Colaborador c = repository.findById(id).get();
		repository.deleteById(id);
		return c;
	}

	@Override
	public Colaborador consultarPorId(Integer id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Colaborador> consultarTodos() {
		return repository.findAll();
	}

	@Override
	public Colaborador consultarPorEmaileSenha(String e, String s) {
		return repository.findByEmailAndSenha(e, s);
	}
}
