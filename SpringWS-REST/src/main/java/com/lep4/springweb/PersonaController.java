package com.lep4.springweb;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
	
	private static final String template = "Hola %s";
	
	
	@RequestMapping("/persona")
	public ArrayList<Persona> getPersona(@RequestParam(value="nombre", defaultValue="Desconocido") String nombre,
			@RequestParam(value="apellidos", defaultValue="Desconocido") String apellido,
			@RequestParam(value="edad", defaultValue="0") int edad) {
		   
		ArrayList<Persona> lista = new ArrayList<Persona>();
		
		Persona p = null;
		for (int i = 0; i < 10; i++) {
			p = new Persona(i, nombre, apellido, edad);
			lista.add(p);
		}
		
		return lista;
	}
	

}
