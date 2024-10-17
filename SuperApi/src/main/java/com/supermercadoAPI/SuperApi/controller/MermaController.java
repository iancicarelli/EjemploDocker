package com.supermercadoAPI.SuperApi.controller;

import com.supermercadoAPI.SuperApi.model.Merma;
import com.supermercadoAPI.SuperApi.model.Producto;
import com.supermercadoAPI.SuperApi.service.MermaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/merma")
public class MermaController {
    @Autowired
    private MermaService mermaService;

    @GetMapping("/buscarPorNombre")
    public ResponseEntity<List<Merma>> buscarPorNombre(@RequestParam String nombre) {
        List<Merma> mermas = mermaService.buscarPorNombre(nombre);
        return ResponseEntity.ok(mermas);
    }
}
