package com.empresa.tutorial.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HolaMundoController {

    @GetMapping("/")
    public String hola() {
        return "Hola Mundo";
    }
    @GetMapping("/saludo")
    public String saludo(@RequestParam String nombre) {
      return "Hola " + nombre;
    }
    @GetMapping("/suma")
    public String Suma(@RequestParam Integer a, @RequestParam Integer b) {
      return "" + (a + b);
    }

    @GetMapping("/validar/{clase}")
    public String validar(@PathVariable String clase, @RequestParam String id) {
      return "validando la clase " + clase +  " y el id " + id;
    }
    
}