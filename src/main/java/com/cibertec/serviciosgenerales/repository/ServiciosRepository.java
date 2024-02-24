package com.cibertec.serviciosgenerales.repository;

import com.cibertec.serviciosgenerales.entity.ServiciosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiciosRepository extends JpaRepository<ServiciosEntity, Long> {
}
