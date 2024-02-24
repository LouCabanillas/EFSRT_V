package com.cibertec.serviciosgenerales.entity;

import lombok.*;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "Genero")
public class GeneroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genero_id")
    private Long generoId;

    @Column(name = "nombre")
    private String nombre;

}