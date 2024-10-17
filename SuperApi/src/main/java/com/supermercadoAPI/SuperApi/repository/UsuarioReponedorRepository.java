package com.supermercadoAPI.SuperApi.repository;


import com.supermercadoAPI.SuperApi.model.UsuarioReponedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioReponedorRepository extends JpaRepository<UsuarioReponedor, Long> {
    List<UsuarioReponedor>findByNombre(String nombre);
}
