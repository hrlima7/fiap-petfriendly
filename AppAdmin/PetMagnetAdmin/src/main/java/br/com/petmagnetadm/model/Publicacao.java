package br.com.petmagnetadm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Publicacao {
	private Estabelecimento Estabelecimento;

	private Anuncio Anuncio;
}
