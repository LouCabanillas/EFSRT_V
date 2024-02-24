package com.cibertec.serviciosgenerales.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "Servicios")
public class ServiciosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "servicio_id")
    private Long servicioId;

    @Column(name = "nombre_servicio")
    private String nombreServicio;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "costo", precision = 10, scale = 2)
    private BigDecimal costo;

}
