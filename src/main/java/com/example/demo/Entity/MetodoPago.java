package com.example.demo.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "metodo_pago")
public class MetodoPago {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idMetodoPago;

    private String metodo;

    public int getIdMetodoPago() {
        return this.idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public String getMetodo() {
        return this.metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
    
}
