package com.cibertec.serviciosgenerales.repository;

import com.cibertec.serviciosgenerales.entity.ClientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<ClientesEntity, Long> {
}
