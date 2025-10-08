package com.example.demo.Service;

import java.util.List;
import com.example.demo.Entity.MetodoPago;

public interface MetodoPagoService {
    public abstract List<MetodoPago> ListarMetodoPagos();
    public abstract MetodoPago ObtenerMetodoPagoPorId(int id);
}
