package br.com.consume.api.correios.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ObjetoAR {
	
	private String codigo;
	private String imagemBase64;
	private String mensagem;
	private List<Eventos> eventos;
	private String tipo;
	private String dataCriacaoImagem;

}
