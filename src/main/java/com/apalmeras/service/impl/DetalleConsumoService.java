package com.apalmeras.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apalmeras.model.DetalleConsumo;
import com.apalmeras.model.Tarjeta;
import com.apalmeras.service.IDetalleConsumoService;

import com.apalmeras.repository.DetelleConsumoRepository;;

@Service
public class DetalleConsumoService implements IDetalleConsumoService {


	@Autowired
	private DetelleConsumoRepository repository;
	
	
	@Override
	public List<DetalleConsumo> listar() {
		// TODO Auto-generated method stub
		return this.repository.findAll();
	}

	@Override
	public void crear(DetalleConsumo detalleConsumo) {
		// TODO Auto-generated method stub
		this.repository.save(detalleConsumo);
	}

	@Override
	public void actualizar(DetalleConsumo detalleConsumo) {
		// TODO Auto-generated method stub
		this.repository.save(detalleConsumo);
	}

	@Override
	public void eliminar(int idDetalleConsumo) {
		// TODO Auto-generated method stub
		this.repository.delete(this.repository.findByidDetalleConsumo(idDetalleConsumo));
	}

	@Override
	public DetalleConsumo obtener(int idDetalleConsumo) {
		// TODO Auto-generated method stub
		return this.repository.findByidDetalleConsumo(idDetalleConsumo);
	}

	@Override
	public List<DetalleConsumo> obtenerDetalleTarjeta(int tarjeta) {
		// TODO Auto-generated method stub
		return this.repository.findByTarjeta(tarjeta);
	}

}
