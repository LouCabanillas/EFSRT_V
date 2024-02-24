package com.cibertec.serviciosgenerales.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Rol")
public class RolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rol_id")
    private Long rolId;

    @Column(name = "nombre")
    private String nombre;

}