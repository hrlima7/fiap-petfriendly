package br.com.petmagnetcom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petmagnetcom.model.Colaborador;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Integer> {
	Colaborador findByEmailAndSenha(String email, String senha);
}
