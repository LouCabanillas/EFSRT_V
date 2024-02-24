package com.cibertec.serviciosgenerales.repository;

import com.cibertec.serviciosgenerales.entity.CitasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitasRepository extends JpaRepository<CitasEntity, Long> {
}
