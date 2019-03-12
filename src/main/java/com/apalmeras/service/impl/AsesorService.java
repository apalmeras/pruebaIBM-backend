package com.apalmeras.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apalmeras.repository.AsesorRepository;
import com.apalmeras.service.IAsesorService;
import com.apalmeras.model.Asesor;

@Service
public class AsesorService implements IAsesorService{
	
	@Autowired
	private AsesorRepository repository;
	
	public List<Asesor> listar() {
		return this.repository.findAll();
	}

	@Override
	public void crear(Asesor asesor) {
		this.repository.save(asesor);
	}

	@Override
	public void actualizar(Asesor asesor) {
		this.repository.save(asesor);
		
	}

	@Override
	public void eliminar(int id) {
		Asesor asesor = this.repository.findByIdAsesor(id);
		this.repository.delete(asesor);
	}

	@Override
	public Asesor obtener(int id) {
		return this.repository.findByIdAsesor(id);
	}
	
	
}
