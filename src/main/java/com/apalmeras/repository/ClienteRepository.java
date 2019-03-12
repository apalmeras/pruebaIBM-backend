package com.apalmeras.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apalmeras.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Serializable>{

	public Cliente findByIdCliente(int idCliente);
	public List<Cliente> findByNombre(String nombre);
}
