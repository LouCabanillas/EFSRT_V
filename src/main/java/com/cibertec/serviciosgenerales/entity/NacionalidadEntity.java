package com.cibertec.serviciosgenerales.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Nacionalidad")
public class NacionalidadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nacionalidad_id")
    private Long nacionalidadId;

    @Column(name = "nombre")
    private String nombre;

}