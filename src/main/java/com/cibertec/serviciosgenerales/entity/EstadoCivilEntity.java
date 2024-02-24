package com.cibertec.serviciosgenerales.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "EstadoCivil")
public class EstadoCivilEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estado_civil_id")
    private Long estadoCivilId;

    @Column(name = "nombre")
    private String nombre;

}