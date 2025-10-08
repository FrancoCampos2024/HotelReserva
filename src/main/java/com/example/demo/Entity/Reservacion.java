package com.example.demo.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "reservacion")
public class Reservacion {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idReservacion;

    private java.sql.Date fechaInicio;
    private java.sql.Date fechaFin;
    private String hora;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "idHabitacion", foreignKey = @ForeignKey(name = "FK_reservacion_habitacion"))
    private Habitacion habitacion;

    @ManyToOne
    @JoinColumn(name = "idMetodoPago", foreignKey = @ForeignKey(name = "FK_reservacion_metodo_pago"))
    private MetodoPago metodoPago;

    public int getIdReservacion() {
        return this.idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public java.sql.Date getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(java.sql.Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public java.sql.Date getFechaFin() {
        return this.fechaFin;
    }

    public void setFechaFin(java.sql.Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getHora() {
        return this.hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Habitacion getHabitacion() {
        return this.habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public MetodoPago getMetodoPago() {
        return this.metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
