package br.com.consume.api.correios.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import feign.auth.BasicAuthRequestInterceptor;

@Configurable
public class AuthentiConfiguration {
	
	
	@Bean
	public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
		
		return new BasicAuthRequestInterceptor("user", "password");
		
	}

}
