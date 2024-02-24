package com.cibertec.serviciosgenerales.service;

import com.cibertec.serviciosgenerales.entity.CitasEntity;

import java.util.List;

public interface CitasService {

    public List<CitasEntity> list();
    public CitasEntity add(CitasEntity o);
    public CitasEntity update(CitasEntity o);
    public void delete(Long id);
    public CitasEntity getById(Long id);

}
