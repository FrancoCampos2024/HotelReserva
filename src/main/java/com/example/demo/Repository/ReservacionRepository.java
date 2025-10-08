package com.example.demo.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Reservacion;

@Repository("reservacionRepositorio")
public interface ReservacionRepository extends JpaRepository<Reservacion, Serializable> {
    // Aquí puedes definir métodos personalizados de consulta si es necesario
    @Query("SELECT r FROM Reservacion r WHERE r.id = ?1")
    public abstract Reservacion buscar(int id);

}
