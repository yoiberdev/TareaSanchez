package com.example.T3Chauca.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/temperatura")
public class T3ChaucaController {
    
    @GetMapping("/celcius-a-fahrenheit")
    public String convertir(@RequestParam double celcius) {
        double fahrenheit = (celcius * 9 / 5 ) + 32;
        return String.format("%.2f°C = %.2f°F", celcius, fahrenheit);
    }
    
}
