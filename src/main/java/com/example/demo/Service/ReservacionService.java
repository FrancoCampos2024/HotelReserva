package com.example.demo.Service;

import java.util.List;
import com.example.demo.Entity.Reservacion;

public interface ReservacionService {
    public abstract List<Reservacion> listarReservaciones();
    public abstract Reservacion reservar(int id); // tiene su query predeterminado
    public abstract Reservacion cancelar(int id);
    public abstract Reservacion buscar(int id);

}
