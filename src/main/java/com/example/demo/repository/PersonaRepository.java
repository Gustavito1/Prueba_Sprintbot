package com.example.demo.repository;

import com.example.demo.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // es un esteoripo ->
public interface PersonaRepository extends JpaRepository<Persona, Long>{ //-> entra el tipo de entidad y el tipo de Id de la entidad
    // Es interfaz porque va a heredar de una clase


}
