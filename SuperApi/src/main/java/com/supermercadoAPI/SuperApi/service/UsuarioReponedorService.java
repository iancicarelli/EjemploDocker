package com.supermercadoAPI.SuperApi.service;

import com.supermercadoAPI.SuperApi.model.UsuarioReponedor;
import com.supermercadoAPI.SuperApi.repository.UsuarioReponedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioReponedorService {
    @Autowired
    private UsuarioReponedorRepository usuarioReponedor;

    public List<UsuarioReponedor> buscarPorNombre(String nombre) {
        return usuarioReponedor.findByNombre(nombre);
    }
}
