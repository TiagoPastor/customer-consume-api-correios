
package br.com.consume.api.correios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CustomerConsumeApiCorreiosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerConsumeApiCorreiosApplication.class, args);
	}

}
