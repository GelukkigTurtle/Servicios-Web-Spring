package com.lep4.springweb;

import org.springframework.web.client.RestTemplate;

public class ApplicationClient {
	
	// Web Service Endpoint
	final static String url = "http://localhost:8086/persona";
	
	public static void main(String args[]) {
		RestTemplate restTemplate = new RestTemplate();
		// se consume el servicio web REST
		ObjetoJson respuesta = restTemplate.getForObject(url, ObjetoJson.class);
		System.out.println(respuesta);
	}

}
