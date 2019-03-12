package com.apalmeras.service;

import java.util.List;

import com.apalmeras.model.Tarjeta;


public interface ITarjetaService  {

	
	public List<Tarjeta> listar();
	
	public void crear(Tarjeta tarjeta);
	
	public void actualizar(Tarjeta tarjeta);
	
	public void eliminar(int idTarjeta);
	
	public Tarjeta obtener(int idTarjeta);
}
