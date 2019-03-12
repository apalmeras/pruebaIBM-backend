package com.apalmeras.service;

import java.util.List;

import com.apalmeras.model.Cliente;;

public interface IClienteService {

	public List<Cliente> listar();
	
	public void crear(Cliente cliente);
	
	public void actualizar(Cliente cliente);
	
	public void eliminar(int idCliente);

	public Cliente obtener(int idCliente);
	
	public List<Cliente> obtenerClientePorNombre(String nombre);
}
