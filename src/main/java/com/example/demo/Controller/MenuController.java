package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    @Qualifier("usuarioServicio")
    private UsuarioService usuarioService;
    @GetMapping("/home")
    public String menu() {
        return "Menu"; // retorna la vista Menu.html
    }
    
    
}
