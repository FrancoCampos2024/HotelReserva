package com.example.demo.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario_reserva")
public class UsuarioReserva {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idUsuarioReserva;

    @ManyToOne
    @JoinColumn(name = "idUsuario", foreignKey = @ForeignKey(name = "FK_Usuario_Reserva_Usuario"))
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idReserva", foreignKey = @ForeignKey(name = "FK_Usuario_Reserva_Reservacion"))
    private Reservacion reservacion;

    public int getIdUsuarioReserva() {
        return this.idUsuarioReserva;
    }

    public void setIdUsuarioReserva(int idUsuarioReserva) {
        this.idUsuarioReserva = idUsuarioReserva;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Reservacion getReservacion() {
        return this.reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }
    
}
