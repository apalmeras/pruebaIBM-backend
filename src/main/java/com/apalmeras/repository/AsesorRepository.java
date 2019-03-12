package com.apalmeras.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apalmeras.model.Asesor;

public interface AsesorRepository extends JpaRepository<Asesor, Serializable> {

	public Asesor findByIdAsesor(int id);
}
