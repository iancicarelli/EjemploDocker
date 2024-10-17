package com.supermercadoAPI.SuperApi.repository;

import com.supermercadoAPI.SuperApi.model.Merma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MermaRepository extends JpaRepository<Merma, Long> {
    List<Merma>findByNombre(String nombre);

}
