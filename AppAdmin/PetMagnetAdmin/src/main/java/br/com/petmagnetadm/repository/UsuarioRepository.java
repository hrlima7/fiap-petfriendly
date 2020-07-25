package br.com.petmagnetadm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petmagnetadm.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	Usuario findByLoginAndSenha(String login, String senha);
}
