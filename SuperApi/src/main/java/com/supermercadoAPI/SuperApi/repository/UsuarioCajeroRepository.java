package com.supermercadoAPI.SuperApi.repository;

import com.supermercadoAPI.SuperApi.model.UsuarioCajero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioCajeroRepository extends JpaRepository<UsuarioCajero, Long> {
    List<UsuarioCajero>findByNombre(String nombre);
}
