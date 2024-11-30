package com.example.Examen_semana_9.service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Examen_semana_9.entity.Persona;

@RestController
@RequestMapping("/Examen")
@CrossOrigin
public class PersonaService {
	@GetMapping("/getPerson")
    public Persona getPerson() {
        
        String nombre = "Antony Bruno";
        String apellido = "Yace Asto";
        int edad = 21;

        
        return new Persona(nombre, apellido, edad);
    }

}
