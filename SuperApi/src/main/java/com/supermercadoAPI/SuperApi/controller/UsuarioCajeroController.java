package com.supermercadoAPI.SuperApi.controller;

import com.supermercadoAPI.SuperApi.model.Producto;
import com.supermercadoAPI.SuperApi.model.UsuarioCajero;
import com.supermercadoAPI.SuperApi.service.UsuarioCajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarioCajero")
public class UsuarioCajeroController {
    @Autowired
    private UsuarioCajeroService usuarioCajeroService;

    @GetMapping("/buscarPorNombre")
    public ResponseEntity<List<UsuarioCajero>> buscarPorNombre(@RequestParam String nombre) {
        List<UsuarioCajero> usuarioCajeros = usuarioCajeroService.buscarPorNombre(nombre);
        return ResponseEntity.ok(usuarioCajeros);
    }
}
