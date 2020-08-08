package br.com.petmagnetcom.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.petmagnetcom.model.Estabelecimento;
import br.com.petmagnetcom.service.EstabelecimentoService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("API/Estabelecimento")
public class EstabelecimentoResource {
	@Autowired
	EstabelecimentoService estabelecimentoService;
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	public Estabelecimento cadastrar(@RequestBody Estabelecimento estabelecimento) {
		return this.estabelecimentoService.cadastrar(estabelecimento);
	}

	@ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)	
	public Estabelecimento consultar(@PathVariable Long id) {
		return this.estabelecimentoService.consultarPorId(id).get();
	}
	
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)	
	public Estabelecimento alterar(@PathVariable Long id, @RequestBody Estabelecimento novo) {
    	return this.estabelecimentoService.alterar(id, novo);
	}	

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)	
	public Estabelecimento excluir(@PathVariable Long id) {
    	return this.estabelecimentoService.excluir(id);
	}	
}
