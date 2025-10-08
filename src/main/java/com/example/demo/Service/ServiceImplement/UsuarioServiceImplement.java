package com.example.demo.Service.ServiceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Usuario;
import com.example.demo.Repository.UsuarioRepository;
import com.example.demo.Service.UsuarioService;

@Service("usuarioServicio")
public class UsuarioServiceImplement implements UsuarioService {
    @Autowired
    @Qualifier("usuarioRepositorio")
    private UsuarioRepository usuarioRepositorio;

    @Override
    public Usuario registrarUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public boolean buscarExisteUsuario(String correo, String password) {
        return usuarioRepositorio.existsByCorreoAndPassword(correo, password);
    }

    @Override
    public boolean esAdmin(String correo) {
        return usuarioRepositorio.esAdmin(correo);   
    }

    @Override
    public boolean buscarPorCorreo(String correo) {
        return usuarioRepositorio.existsByCorreo(correo);
    }
    
}
