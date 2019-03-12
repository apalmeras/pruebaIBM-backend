package com.apalmeras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apalmeras.model.Tarjeta;

public interface TarjetaRepository extends JpaRepository<Tarjeta, Integer> {

	public Tarjeta findByIdTarjeta(int idTarjeta);
}
