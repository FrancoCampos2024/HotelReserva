package com.example.demo.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "boleta")
public class Boleta {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBoleta;
    
    private java.sql.Date fechaEmision;

    @ManyToOne
    @JoinColumn(name = "idUsuarioReserva", foreignKey = @ForeignKey(name = "FK_Boleta_Usuario_Reserva"))
    private UsuarioReserva usuarioReserva;

    public int getIdBoleta() {
        return this.idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }

    public java.sql.Date getFechaEmision() {
        return this.fechaEmision;
    }

    public void setFechaEmision(java.sql.Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public UsuarioReserva getUsuarioReserva() {
        return this.usuarioReserva;
    }

    public void setUsuarioReserva(UsuarioReserva usuarioReserva) {
        this.usuarioReserva = usuarioReserva;
    }

}
