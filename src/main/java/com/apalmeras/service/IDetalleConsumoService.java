package com.apalmeras.service;

import java.util.List;

import com.apalmeras.model.DetalleConsumo;
import com.apalmeras.model.Tarjeta;

public interface IDetalleConsumoService {

	public List<DetalleConsumo> listar();
	
	public void crear(DetalleConsumo detalleConsumo);
	
	public void actualizar(DetalleConsumo detalleConsumo);
	
	public void eliminar(int detalleConsumo);
	
	public DetalleConsumo obtener(int detalleConsumo);
	
	public List<DetalleConsumo> obtenerDetalleTarjeta(int tarjeta);
}
