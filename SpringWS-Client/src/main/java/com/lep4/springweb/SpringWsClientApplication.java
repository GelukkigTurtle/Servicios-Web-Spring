package com.lep4.springweb;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringWsClientApplication {
	

	// Web Service Endpoint
	final static String url = "http://localhost:8086/persona?nombre=Julio&apellidos=Hernandez&edad=20";

	public static void main(String[] args) {
		SpringApplication.run(SpringWsClientApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run (RestTemplate restTemplate) {
		return args -> {
			ArrayList<ObjetoJson> respuesta = restTemplate.getForObject(url, ArrayList.class);
			System.out.println("Respuesta del Web Service REST");
			System.out.println(respuesta);
		};
	}
	
	
}
