package com.gestion.de.clases.parcial2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Estudiantescontrolador {
          @Autowired
    private Estudiantesrepositorio Repositorio;
          @GetMapping
          public List<Estudiantes> listartodoslosestudiante(){
              return Repositorio.findAll();
          }
}
