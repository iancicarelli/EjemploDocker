package com.supermercadoAPI.SuperApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue
    private long id;

    private String nombre;
    private String seccion;
    private int stock;
    private int precio;
    private String ubicacion;



}
