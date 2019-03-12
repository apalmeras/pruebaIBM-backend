package com.apalmeras.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apalmeras.repository.TarjetaRepository;
import com.apalmeras.service.ITarjetaService;
import com.apalmeras.model.Tarjeta;

@Service
public class TarjetaService implements ITarjetaService {

	@Autowired
	private TarjetaRepository repository;
	
	public List<Tarjeta> listar(){
		return this.repository.findAll();
	}

	@Override
	public void crear(Tarjeta tarjeta) {
		this.repository.save(tarjeta);		
	}

	@Override
	public void actualizar(Tarjeta tarjeta) {
		this.repository.save(tarjeta);
	}

	@Override
	public void eliminar(int idTarjeta) {
		this.repository.delete(this.repository.findByIdTarjeta(idTarjeta));
	}

	@Override
	public Tarjeta obtener(int idTarjeta) {
		// TODO Auto-generated method stub
		return this.repository.findByIdTarjeta(idTarjeta);
	}
}
