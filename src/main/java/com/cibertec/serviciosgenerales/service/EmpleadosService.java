package com.cibertec.serviciosgenerales.service;

import com.cibertec.serviciosgenerales.entity.EmpleadosEntity;

import java.util.List;

public interface EmpleadosService {

    public List<EmpleadosEntity> list();
    public EmpleadosEntity add(EmpleadosEntity o);
    public EmpleadosEntity update(EmpleadosEntity o);
    public void delete(Long id);
    public EmpleadosEntity getById(Long id);

}
