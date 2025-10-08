package com.example.demo.Service;

import java.util.List;
import com.example.demo.Entity.TipoHabitacion;

public interface TipoHabitacionService {
    public abstract List<TipoHabitacion> ListarTipoHabitaciones();
    public abstract TipoHabitacion ObtenerTipoHabitacionPorId(int id);
}
