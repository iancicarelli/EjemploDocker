package com.supermercadoAPI.SuperApi.controller;

import com.supermercadoAPI.SuperApi.model.Producto;
import com.supermercadoAPI.SuperApi.model.UsuarioReponedor;
import com.supermercadoAPI.SuperApi.service.UsuarioReponedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarioReponedor")
public class UsuarioReponedorController {
    @Autowired
    private UsuarioReponedorService usuarioReponedorService;

    @GetMapping("/buscarPorNombre")
    public ResponseEntity<List<UsuarioReponedor>> buscarPorNombre(@RequestParam String nombre) {
        List<UsuarioReponedor> usuarioReponedores = usuarioReponedorService.buscarPorNombre(nombre);
        return ResponseEntity.ok(usuarioReponedores);
    }
}
