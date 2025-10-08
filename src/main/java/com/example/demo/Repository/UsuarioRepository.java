package com.example.demo.Repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.Usuario;

@Repository("usuarioRepositorio")
public interface UsuarioRepository extends JpaRepository<Usuario, Serializable> {
    // Aquí puedes definir métodos personalizados de consulta si es necesario
        //@Query("SELECT u FROM Usuario u WHERE u.correo = ?1 AND u.password = ?2")
        //public Usuario obtenerDetallesUsuario(String correo, String password);
    /* 
    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM Usuario u WHERE u.id = ?1")
    public boolean buscarExisteUsuario(int id);
    */
    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM Usuario u WHERE u.correo = ?1 AND u.password = ?2")
    public boolean existsByCorreoAndPassword(String correo, String password);

    @Query("SELECT u.tipoUsuario.tipo = 'administrador' FROM Usuario u WHERE u.correo = ?1")
    public boolean esAdmin(String correo);
    // u.tipoUsuario.tipo => tipoUsuario es el nombre del atributo en la entidad Usuario

    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM Usuario u WHERE u.correo = ?1")
    public boolean existsByCorreo(String correo);

}
