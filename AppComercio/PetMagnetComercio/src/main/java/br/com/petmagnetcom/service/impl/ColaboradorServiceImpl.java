package br.com.petmagnetcom.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sun.xml.txw2.IllegalSignatureException;

import br.com.petmagnetcom.model.Colaborador;
import br.com.petmagnetcom.model.Estabelecimento;
import br.com.petmagnetcom.repository.ColaboradorRepository;
import br.com.petmagnetcom.repository.EstabelecimentoRepository;
import br.com.petmagnetcom.service.ColaboradorService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ColaboradorServiceImpl implements ColaboradorService {
	private ColaboradorRepository colaboradorRepository;
	private EstabelecimentoRepository estabelecimentoRepository;

	public ColaboradorServiceImpl(ColaboradorRepository cr, EstabelecimentoRepository er) {
		this.colaboradorRepository = cr;
		this.estabelecimentoRepository = er;
	}
	
	@Override
	public Colaborador inserir(Colaborador obj) {
		Estabelecimento estabelecimento = this.estabelecimentoRepository.findById(obj.getEstabelecimento().getId())
				.orElseThrow( () -> new IllegalSignatureException("Este Estabelecimento não está cadastrado"));
		
		//Colaborador colaborador = this.colaboradorRepository.FindByNomeAndSenha
				
				
		return null;
	}

	@Override
	public Colaborador alterar(Colaborador obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Colaborador excluir(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Colaborador consultarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Colaborador> consultarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Colaborador consultarPorEmaileSenha(String e, String s) {
		// TODO Auto-generated method stub
		return null;
	}

}
