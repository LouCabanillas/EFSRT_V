package com.cibertec.serviciosgenerales.service.impl;

import com.cibertec.serviciosgenerales.entity.CitasEntity;
import com.cibertec.serviciosgenerales.repository.CitasRepository;
import com.cibertec.serviciosgenerales.service.CitasService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CitasServiceImpl implements CitasService {

    @Autowired
    CitasRepository repository;

    @Override
    public List<CitasEntity> list() {
        return repository.findAll();
    }

    @Override
    public CitasEntity add(CitasEntity o) {
        return repository.save(o);
    }

    @Override
    public CitasEntity update(CitasEntity o) {
        return repository.save(o);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public CitasEntity getById(Long id) {
        return repository.findById(id)
                .orElse(new CitasEntity());
    }

}
