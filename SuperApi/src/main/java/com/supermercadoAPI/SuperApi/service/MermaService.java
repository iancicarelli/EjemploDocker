package com.supermercadoAPI.SuperApi.service;

import com.supermercadoAPI.SuperApi.model.Merma;
import com.supermercadoAPI.SuperApi.repository.MermaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MermaService {
    @Autowired
    private MermaRepository mermaRepository;

    public List<Merma> buscarPorNombre(String nombre) {
        return mermaRepository.findByNombre(nombre);
    }
}
