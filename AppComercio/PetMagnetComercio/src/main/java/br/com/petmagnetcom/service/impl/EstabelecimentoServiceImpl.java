package br.com.petmagnetcom.service.impl;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.maps.errors.ApiException;

import br.com.petmagnetcom.model.Endereco;
import br.com.petmagnetcom.model.Estabelecimento;
import br.com.petmagnetcom.repository.EnderecoRepository;
import br.com.petmagnetcom.repository.EstabelecimentoRepository;
import br.com.petmagnetcom.service.EstabelecimentoService;
import br.com.petmagnetcom.util.GeoLocalizacao;
import br.com.petmagnetcom.util.Localizacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Service
@Transactional
public class EstabelecimentoServiceImpl implements EstabelecimentoService {
	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;

	@Override
	public Estabelecimento cadastrar(Estabelecimento estb) {
		Endereco endereco = this.enderecoRepository.findByLogradouroAndNumeroAndBairroAndCidadeAndUF(
				estb.getEndereco().getLogradouro(), estb.getEndereco().getNumero(), estb.getEndereco().getBairro(),
				estb.getEndereco().getCidade(), estb.getEndereco().getUF())
				.orElseGet(	
						() -> gravarNovoEndereco(estb.getEndereco())
				);

		if (endereco == null) {
			return null;
		}
		
		estb.setEndereco(endereco);
		
		return this.estabelecimentoRepository.save(estb);
	}

	@Override
	public Estabelecimento excluir(Long id) {
		return this.estabelecimentoRepository.findById(id)
				.map(estabelecimento -> {
					this.estabelecimentoRepository.deleteById(id);
					return estabelecimento;
				}).orElseThrow(() -> new IllegalStateException("Este estabelecimento não está cadastrado"));
	}

	@Override
	public List<Estabelecimento> consultarTodos() {

		return null;
	}

	@Override
	public Optional<Estabelecimento> consultarPorId(Long id) {
		return this.estabelecimentoRepository.findById(id);
	}

	@Override
	public Estabelecimento alterar(Long id, Estabelecimento novoEstabel) {
		
		Endereco novoEndereco = this.enderecoRepository.findByLogradouroAndNumeroAndBairroAndCidadeAndUF(
				novoEstabel.getEndereco().getLogradouro(),
				novoEstabel.getEndereco().getNumero(), 
				novoEstabel.getEndereco().getBairro(), 
				novoEstabel.getEndereco().getCidade(), 
				novoEstabel.getEndereco().getUF())
				.map(endereco -> {
					endereco.setCep(novoEstabel.getEndereco().getCep());
					endereco.setUF(novoEstabel.getEndereco().getUF());
					endereco.setPais(novoEstabel.getEndereco().getPais());
					endereco.setLatitude(novoEstabel.getEndereco().getLatitude());
					endereco.setLongitude(novoEstabel.getEndereco().getLongitude());
					
					return this.enderecoRepository.save(endereco);
				})
				.orElseGet(() -> {
					return this.enderecoRepository.save(novoEstabel.getEndereco());
				});							

		return this.estabelecimentoRepository.findById(id)
				.map(estabalecimento -> {
					estabalecimento.setNome(novoEstabel.getNome());
					estabalecimento.setComplEndereco(novoEstabel.getComplEndereco());
					estabalecimento.setEndereco(novoEndereco);
					
					return this.estabelecimentoRepository.save(estabalecimento);
				})
				.orElseGet(() -> {
					novoEstabel.setId(id);
					novoEstabel.setEndereco(novoEndereco);
					
					return this.estabelecimentoRepository.save(novoEstabel);
				});
	}
	
	private Endereco gravarNovoEndereco(Endereco e) {
		GeoLocalizacao gl = new GeoLocalizacao();
		Localizacao lcl = new Localizacao();
		
		try {
			lcl = gl.getGeoLocalizacao(e.getCep());
			
			e.setLatitude(lcl.getLatitude());
			e.setLongitude(lcl.getLongitude());
			
			this.enderecoRepository.save(e);
			
		} catch (ApiException e1) {
			
		} catch (InterruptedException e1) {
			
		} catch (IOException e1) {
			
		} catch (ParseException e1) {
			
		} catch (org.json.simple.parser.ParseException e1) {
			
		}

		return e;
	}
}
