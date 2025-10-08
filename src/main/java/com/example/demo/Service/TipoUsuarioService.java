package com.example.demo.Service;

import java.util.List;
import com.example.demo.Entity.TipoUsuario;

public interface TipoUsuarioService {
    public abstract List<TipoUsuario> ListarTipoUsuarios();
    public abstract TipoUsuario ObtenerTipoUsuarioPorId(int id);
    
}
