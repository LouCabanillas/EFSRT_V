package com.cibertec.serviciosgenerales.service.impl;

import com.cibertec.serviciosgenerales.entity.ClientesEntity;
import com.cibertec.serviciosgenerales.repository.ClientesRepository;
import com.cibertec.serviciosgenerales.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClientesServiceImpl implements ClientesService {

    @Autowired
    ClientesRepository repository;

    @Override
    public List<ClientesEntity> list() {
        return repository.findAll();
    }

    @Override
    public ClientesEntity add(ClientesEntity o) {
        return repository.save(o);
    }

    @Override
    public ClientesEntity update(ClientesEntity o) {
        return repository.save(o);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public ClientesEntity getById(Long id) {
        return repository.findById(id)
                .orElse(new ClientesEntity());
    }

}
