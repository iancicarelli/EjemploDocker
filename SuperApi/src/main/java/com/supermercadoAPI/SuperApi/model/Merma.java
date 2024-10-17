package com.supermercadoAPI.SuperApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="merma")
public class Merma {
    @Id
    @GeneratedValue
    private long id;


    private String nombre;
    private String motivo;
    private int cantidad;



}
