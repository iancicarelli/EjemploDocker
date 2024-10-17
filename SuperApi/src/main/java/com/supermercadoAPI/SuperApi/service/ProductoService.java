package com.supermercadoAPI.SuperApi.service;

import com.supermercadoAPI.SuperApi.model.Producto;
import com.supermercadoAPI.SuperApi.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> buscarPorNombre(String nombre) {
        return productoRepository.findByNombre(nombre);
    }

}
