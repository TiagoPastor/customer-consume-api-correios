package br.com.consume.api.correios.consume;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.consume.api.correios.config.AuthentiConfiguration;
import br.com.consume.api.correios.input.ObjetoInput;
import br.com.consume.api.correios.models.ObjetoAR;

@FeignClient(name = "objeto", configuration = AuthentiConfiguration.class ,
             url = "https://cws.correios.com.br/areletronico/v1/ars" )
public interface ObjetoCorreios {
	
	@RequestMapping(value = "/versao", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	String getVersao();
	
	
	@RequestMapping(value = "/eventos", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	List<ObjetoAR> getEventos(@RequestBody ObjetoInput objeto);
	
	
	@RequestMapping(value = "/primeiroevento", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	List<ObjetoAR> getPrimeiroevento(@RequestBody ObjetoInput objeto);
	
	
	@RequestMapping(value = "/ultimoevento", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	List<ObjetoAR> getUltimoevento(@RequestBody ObjetoInput objeto);

}
