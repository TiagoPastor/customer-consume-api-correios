package br.com.consume.api.correios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.consume.api.correios.consume.ObjetoCorreios;
import br.com.consume.api.correios.input.ObjetoInput;
import br.com.consume.api.correios.models.ObjetoAR;

@RestController
public class ObjetoCorreiosController {
	
	
	
	@Autowired
	private ObjetoCorreios objetoCorreios;
	
	
	
	
	@GetMapping("/versao")
	public String versao() {
		
		return objetoCorreios.getVersao();
	}
	
	
	
	@PostMapping("/eventos")
	public List<ObjetoAR> eventos(@RequestBody ObjetoInput objetos) {
		
		return objetoCorreios.getEventos(objetos);
	}
	
	
	
	@PostMapping("/primeiroevento")
	public List<ObjetoAR> primeiroevento(@RequestBody ObjetoInput objetos) {
		
		return objetoCorreios.getPrimeiroevento(objetos);
	}
	
	
	
	@PostMapping("/ultimoevento")
	public List<ObjetoAR> ultimoevento(@RequestBody ObjetoInput objetos) {
		
		return objetoCorreios.getUltimoevento(objetos);
	}

}
