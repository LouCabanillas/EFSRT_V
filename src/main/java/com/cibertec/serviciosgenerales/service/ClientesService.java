package com.cibertec.serviciosgenerales.service;

import com.cibertec.serviciosgenerales.entity.ClientesEntity;

import java.util.List;

public interface ClientesService {

    public List<ClientesEntity> list();
    public ClientesEntity add(ClientesEntity o);
    public ClientesEntity update(ClientesEntity o);
    public void delete(Long id);
    public ClientesEntity getById(Long id);

}
