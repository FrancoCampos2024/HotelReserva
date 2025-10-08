package com.example.demo.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "tipo_habitacion")
public class TipoHabitacion {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTipoHabitacion;

    private String tipo;
    private double precio;
    private int cantidadPersonas;
    private int cantidadCamas;

    public int getIdTipoHabitacion() {
        return this.idTipoHabitacion;
    }

    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadPersonas() {
        return this.cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getCantidadCamas() {
        return this.cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }
    
}
