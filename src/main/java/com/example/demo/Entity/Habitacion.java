package com.example.demo.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "habitacion")
public class Habitacion {    
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idHabitacion;
    
    private int numeroHabitacion;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "idTipoHabitacion", foreignKey = @ForeignKey(name = "FK_Habitacion_Tipo_Habitacion"))
    private TipoHabitacion tipoHabitacion;

    public int getIdHabitacion() {
        return this.idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getNumeroHabitacion() {
        return this.numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public TipoHabitacion getTipoHabitacion() {
        return this.tipoHabitacion;
    }
    
    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

}
