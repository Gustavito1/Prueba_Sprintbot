package com.example.demo.controller;

import com.example.demo.entities.Persona;
import com.example.demo.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.data.web.JsonPath;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    // la clase model sirve para transferir objetos del controller a la vista
    @GetMapping
    public String listarPersonas(Model model){
        List<Persona> personas = personaService.obtenerTodos();
        model.addAttribute("personasLista", personas); //key-value
        return "listar";
    }

    @GetMapping("/nuevo")
    public String mostrarFormPersona(Model model){
        model.addAttribute("persona", new Persona());
        model.addAttribute("accion", "/personas/nuevo");
        return "formulario";
    }

    @PostMapping("/nuevo")
    public String guardarNuevaPersona(@ModelAttribute Persona persona){
        personaService.crearPersona(persona);
        return "redirect:/personas";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormEditarPersona(@PathVariable Long id, @ModelAttribute Persona persona, Model model){
        model.addAttribute("persona", persona);
        model.addAttribute("accion", "/personas/editar/"+id);
        return "formulario";
    }

    @PostMapping("editar/{id}")
    public String actualizarPersona(@PathVariable Long id, @ModelAttribute Persona persona, Model model){
        personaService.actualizarPersona(id, persona);
        return "redirect:/personas";

    }

    @GetMapping("eliminar/{id}")
    public String eliminarPersona(@PathVariable Long id){
        personaService.eliminarPersona(id);
        return "redirect:/personas";

    }
}
