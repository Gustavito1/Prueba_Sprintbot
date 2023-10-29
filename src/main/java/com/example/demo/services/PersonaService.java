package com.example.demo.services;

import com.example.demo.entities.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> obtenerTodos();

    Persona obtenerId(Long id);

    Persona crearPersona(Persona persona);

    Persona actualizarPersona(Long id, Persona persona);

    void eliminarPersona(Long id);

    long contarPersonas();
}
