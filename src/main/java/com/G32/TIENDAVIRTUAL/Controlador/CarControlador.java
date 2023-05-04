package com.G32.tiendavirtual.Controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CarControlador {
    @GetMapping("/car")
    public String obtenerCar(){
        return "Hola Mundo";
    }
}
