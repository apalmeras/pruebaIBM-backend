package com.apalmeras.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.apalmeras.model.DetalleConsumo;
import com.apalmeras.model.Tarjeta;


public interface DetelleConsumoRepository extends JpaRepository<DetalleConsumo, Serializable> {

	@Query("SELECT dc FROM DetalleConsumo dc WHERE dc.tarjeta.idTarjeta=?1")
	List<DetalleConsumo> findByTarjeta(int tarjeta);
	DetalleConsumo findByidDetalleConsumo(int id);
}
