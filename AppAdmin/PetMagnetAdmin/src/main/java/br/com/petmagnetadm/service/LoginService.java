package br.com.petmagnetadm.service;

import org.springframework.stereotype.Service;

import br.com.petmagnetadm.model.Estabelecimento;
import lombok.RequiredArgsConstructor;

@Service
public interface LoginService {
	public Estabelecimento conectar(String email, String senha, EstabelecimentoService service);
	public void desconectar(Estabelecimento e);
}
