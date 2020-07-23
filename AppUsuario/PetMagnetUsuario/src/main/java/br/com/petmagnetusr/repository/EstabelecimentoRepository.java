package br.com.petmagnetusr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petmagnetusr.model.Estabelecimento;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Integer> {

}
