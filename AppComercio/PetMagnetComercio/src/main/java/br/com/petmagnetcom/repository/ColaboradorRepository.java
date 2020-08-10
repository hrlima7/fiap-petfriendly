package br.com.petmagnetcom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.petmagnetcom.model.Colaborador;

@Repository
public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {
}
