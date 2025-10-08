package com.example.demo.Service.ServiceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Habitacion;
import com.example.demo.Repository.HabitacionRepository;
import com.example.demo.Service.HabitacionService;

@Service("habitacionServicio")
public class HabitacionServiceImplement implements HabitacionService {
    @Autowired
    @Qualifier("habitacionRepositorio")
    private HabitacionRepository habitacionRepositorio;

    @Override
    public List<Habitacion> ListarHabitaciones() {
        return habitacionRepositorio.findAll();
    }

    @Override
    public Habitacion ObtenerHabitacionPorId(int id) {
        return habitacionRepositorio.findById(id).orElse(null);
    }

    @Override
    public List<Habitacion> ListarHabitacionesPorTipo(String tipo) {
        return habitacionRepositorio.ListarHabitacionesPorTipo(tipo);
    }

    @Override
    public List<Habitacion> ListarHabitacionesDisponibles(String estado) {
        return habitacionRepositorio.ListarHabitacionesDisponibles(estado);
    }
    
}
