package com.example.demo.Service;

import com.example.demo.Entity.Usuario;

public interface UsuarioService {
    public abstract Usuario registrarUsuario(Usuario usuario);
    public abstract boolean buscarExisteUsuario(String correo, String password);
    public abstract boolean esAdmin(String correo);
    public abstract boolean buscarPorCorreo(String correo);

}
