package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //Toda clase de entidad que se quiera mapear como una table en una BD tiene que agregarse Entity
@Table(name = "tb_persona") //Agregar un nombre personalizado en la tabla

//Getters y Setters
@Data
@AllArgsConstructor //Constructor con todas las clases
@NoArgsConstructor //Constructor sin ninguna clase

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int edad;
}
