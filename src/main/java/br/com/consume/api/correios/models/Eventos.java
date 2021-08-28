package br.com.consume.api.correios.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Eventos {
	
	private String tipoEvento;
	private String descricaoEvento;
	private String nomeUnidade;
	private String municipio;
	private String uf;
	private String dataCriacao;
	private String dataCriacaoAsDate;

}
