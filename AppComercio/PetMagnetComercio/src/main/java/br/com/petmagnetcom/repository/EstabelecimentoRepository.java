package br.com.petmagnetcom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petmagnetcom.model.Estabelecimento;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
	
}
