package com.example.demo.Service;

import java.util.List;
import com.example.demo.Entity.Habitacion;

public interface HabitacionService {
    public abstract List<Habitacion> ListarHabitaciones();
    public abstract Habitacion ObtenerHabitacionPorId(int id);
    public abstract List<Habitacion> ListarHabitacionesPorTipo(String tipo);
    public abstract List<Habitacion> ListarHabitacionesDisponibles(String estado);

}
