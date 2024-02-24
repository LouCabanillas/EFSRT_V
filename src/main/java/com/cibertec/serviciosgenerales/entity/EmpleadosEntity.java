package com.cibertec.serviciosgenerales.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "Empleados")
public class EmpleadosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empleado_id")
    private Long empleadoId;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "puesto")
    private String puesto;

    @Column(name = "salario", precision = 10, scale = 2)
    private BigDecimal salario;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @Column(name = "fecha_nacimiento")
    private java.sql.Date fechaNacimiento;

    @Column(name = "genero_id")
    private Integer generoId;

    @Column(name = "estado_civil_id")
    private Integer estadoCivilId;

    @Column(name = "nacionalidad_id")
    private Integer nacionalidadId;

    @Column(name = "fecha_contratacion")
    private java.sql.Date fechaContratacion;

    @Column(name = "rol_id")
    private Integer rolId;

    @ManyToOne
    @JoinColumn(name = "genero_id", insertable = false, updatable = false)
    private GeneroEntity genero;

    @ManyToOne
    @JoinColumn(name = "estado_civil_id", insertable = false, updatable = false)
    private EstadoCivilEntity estadoCivil;

    @ManyToOne
    @JoinColumn(name = "nacionalidad_id", insertable = false, updatable = false)
    private NacionalidadEntity nacionalidad;

    @ManyToOne
    @JoinColumn(name = "rol_id", insertable = false, updatable = false)
    private RolEntity rol;
}
