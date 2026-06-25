package com.vacavoa.ventos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class VentosHomeController {
    @GetMapping("/ventos-home")
    public String getVentosHome() {
        return "Hello from Ventos";
    }
    
}
