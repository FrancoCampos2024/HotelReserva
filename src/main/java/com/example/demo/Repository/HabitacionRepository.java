package com.example.demo.Repository;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.Habitacion;

@Repository("habitacionRepositorio")
public interface HabitacionRepository extends JpaRepository<Habitacion, Serializable> {
    // Aquí puedes definir métodos personalizados de consulta si es necesario
    @Query("SELECT h FROM Habitacion h WHERE h.tipoHabitacion.tipo = ?1")
    public List<Habitacion> ListarHabitacionesPorTipo(String tipo);
    // cuando realice la consulta, debe coincidir con el nombre del atributo en la entidad Habitacion
    // no con el nombre de la columna en la base de datos
    @Query("SELECT h FROM Habitacion h WHERE h.estado = ?1")
    public List<Habitacion> ListarHabitacionesDisponibles(String estado);

}
