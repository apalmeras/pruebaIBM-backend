package com.apalmeras.service;

import java.util.List;

import com.apalmeras.model.Asesor;


public interface IAsesorService {
	
	
	public List<Asesor> listar();
	
	public void crear(Asesor asesor);
	
	public void actualizar(Asesor asesor);
	
	public void eliminar(int id);
	
	public Asesor obtener(int id);
}
