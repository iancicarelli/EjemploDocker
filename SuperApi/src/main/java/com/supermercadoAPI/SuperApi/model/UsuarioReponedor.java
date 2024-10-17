package com.supermercadoAPI.SuperApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarioReponedor")
public class UsuarioReponedor {
    @Id
    @GeneratedValue
    private long id;

    private String nombre;
    private int rut;
    private String usuario;
    private String contraseña;
    private String seccion;
}
