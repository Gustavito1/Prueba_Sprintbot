package com.example.demo.services.impl;

import com.example.demo.entities.Persona;
import com.example.demo.repository.PersonaRepository;
import com.example.demo.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Practicamente le decimos que este servicio va a depender del repository
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;


    @Override
    public List<Persona> obtenerTodos() {
        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerId(Long id) {
        return personaRepository.findById(id).orElse(null);

    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona actualizarPersona(Long id, Persona persona) {
        Persona personaBD = personaRepository.findById(id).orElse(null);

        if(personaBD != null){
            personaBD.setNombre(persona.getNombre());
            personaBD.setEdad(persona.getEdad());
            return personaRepository.save(personaBD);
        }
        return null; //En caso de que la persona sea nulo o no exista
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);

    }

    @Override
    public long contarPersonas() {
        return personaRepository.count();
    }
}
