package com.cibertec.serviciosgenerales.service.impl;

import com.cibertec.serviciosgenerales.entity.EmpleadosEntity;
import com.cibertec.serviciosgenerales.repository.EmpleadosRepository;
import com.cibertec.serviciosgenerales.service.EmpleadosService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmpleadosServiceImpl implements EmpleadosService {

    @Autowired
    EmpleadosRepository repository;

    @Override
    public List<EmpleadosEntity> list() {
        return repository.findAll();
    }

    @Override
    public EmpleadosEntity add(EmpleadosEntity o) {
        return repository.save(o);
    }

    @Override
    public EmpleadosEntity update(EmpleadosEntity o) {
        return repository.save(o);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public EmpleadosEntity getById(Long id) {
        return repository.findById(id)
                .orElse(new EmpleadosEntity());
    }

}
