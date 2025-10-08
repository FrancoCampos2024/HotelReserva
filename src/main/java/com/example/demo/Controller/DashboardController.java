package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Service.UsuarioService;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {
    @Autowired
    @Qualifier("usuarioServicio")
    private UsuarioService usuarioService;

    @GetMapping("/inicio")
    public String dashboard() {
        
        return "Dashboard"; // retorna la vista Dashboard.html
    }

}
