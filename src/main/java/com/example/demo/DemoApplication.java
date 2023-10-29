package com.example.demo;

import com.example.demo.entities.Persona;
import com.example.demo.repository.PersonaRepository;
import com.example.demo.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private PersonaService personaService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


	}
/*
	@Override
	public void run(String... args) throws Exception {
		personaService.crearPersona(new Persona(5L,"Gsdfrg",24));
		personaService.crearPersona(new Persona(6L,"styrty",23));
		personaService.crearPersona(new Persona(7L,"Gghfnb",22));
		personaService.crearPersona(new Persona(8L,"gfhdgfh",21));

		//Mostrar el numero de personas
		System.out.println("Numero de empleados guardados: " + personaService.contarPersonas());

		//Mostrar la lsita de personas
		List<Persona> personas = personaService.obtenerTodos();
		personas.forEach(p -> System.out.println("Nombre de la persona: " + p.getNombre()));

	}*/
}
