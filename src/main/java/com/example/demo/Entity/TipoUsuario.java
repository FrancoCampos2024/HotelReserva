package com.example.demo.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "tipo_usuario")
public class TipoUsuario {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTipoUsuario;

    private String tipo;

    public int getIdTipoUsuario() {
        return this.idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
