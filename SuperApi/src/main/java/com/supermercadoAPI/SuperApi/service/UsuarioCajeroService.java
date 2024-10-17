package com.supermercadoAPI.SuperApi.service;

import com.supermercadoAPI.SuperApi.model.UsuarioCajero;
import com.supermercadoAPI.SuperApi.repository.UsuarioCajeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioCajeroService {
    @Autowired
    private UsuarioCajeroRepository usuarioCajeroRepository;

    public List<UsuarioCajero> buscarPorNombre(String nombre){
        return usuarioCajeroRepository.findByNombre(nombre);
    }
}
