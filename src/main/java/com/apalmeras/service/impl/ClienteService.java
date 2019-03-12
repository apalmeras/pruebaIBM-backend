package com.apalmeras.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apalmeras.repository.ClienteRepository;
import com.apalmeras.service.IClienteService;
import com.apalmeras.model.Cliente;;

@Service
public class ClienteService implements IClienteService{

	@Autowired
	private ClienteRepository repository;
	
	public List<Cliente> listar(){
		return this.repository.findAll();
	}

	@Override
	public void crear(Cliente cliente) {
		this.repository.save(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		this.repository.save(cliente);
	}

	@Override
	public void eliminar(int idCliente) {
		this.repository.delete(this.repository.findByIdCliente(idCliente));
		
	}

	@Override
	public Cliente obtener(int idCliente) {
		return this.repository.findByIdCliente(idCliente);		
	}

	@Override
	public List<Cliente> obtenerClientePorNombre(String nombre) {
		
		return this.repository.findByNombre("%"+nombre+"%");
	}
}
