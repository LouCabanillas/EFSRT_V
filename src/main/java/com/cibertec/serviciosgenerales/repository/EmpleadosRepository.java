package com.cibertec.serviciosgenerales.repository;

import com.cibertec.serviciosgenerales.entity.EmpleadosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadosRepository extends JpaRepository<EmpleadosEntity, Long> {
}
