package br.com.petmagnetcom.service;

import org.springframework.stereotype.Service;

import br.com.petmagnetcom.model.Estabelecimento;
import lombok.RequiredArgsConstructor;

@Service
public interface LoginService {
	public Estabelecimento conectar(String email, String senha, EstabelecimentoService service);
	public void desconectar(Estabelecimento e);
}
