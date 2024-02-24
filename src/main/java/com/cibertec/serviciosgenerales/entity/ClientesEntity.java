package com.cibertec.serviciosgenerales.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
@Table(name = "Clientes")
public class ClientesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private Long clienteId;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "genero_id")
    private Integer generoId;

    @Column(name = "estado_civil_id")
    private Integer estadoCivilId;

    @Column(name = "nacionalidad_id")
    private Integer nacionalidadId;

    @Column(name = "fecha_registro")
    private Timestamp fechaRegistro;

    @ManyToOne
    @JoinColumn(name = "genero_id", insertable = false, updatable = false)
    private GeneroEntity genero;

    @ManyToOne
    @JoinColumn(name = "estado_civil_id", insertable = false, updatable = false)
    private EstadoCivilEntity estadoCivil;

    @ManyToOne
    @JoinColumn(name = "nacionalidad_id", insertable = false, updatable = false)
    private NacionalidadEntity nacionalidad;

}
