package br.com.petmagnetadm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petmagnetadm.model.Colaborador;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Integer> {
	Colaborador findByEmailAndSenha(String email, String senha);
}
