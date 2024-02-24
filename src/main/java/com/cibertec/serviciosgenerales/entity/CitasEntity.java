package com.cibertec.serviciosgenerales.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Citas")
public class CitasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cita_id")
    private Long citaId;


    @Column(name = "fecha_hora")
    private java.sql.Timestamp fechaHora;

    @Column(name = "cliente_id")
    private Long clienteId;

    @Column(name = "empleado_id")
    private Long empleadoId;

    @Column(name = "servicio_id")
    private Long servicioId;

    @ManyToOne
    @JoinColumn(name = "cliente_id", insertable = false, updatable = false)
    private ClientesEntity cliente;

    @ManyToOne
    @JoinColumn(name = "empleado_id", insertable = false, updatable = false)
    private EmpleadosEntity empleado;

    @ManyToOne
    @JoinColumn(name = "servicio_id", insertable = false, updatable = false)
    private ServiciosEntity servicio;

}
