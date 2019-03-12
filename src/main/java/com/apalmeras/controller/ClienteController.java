package com.apalmeras.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apalmeras.model.Cliente;
import com.apalmeras.service.IClienteService;



@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private IClienteService service;
	

	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Cliente>> listar() {
		List<Cliente> clientes = new ArrayList<>();
		clientes = service.listar();
		return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);

	}
	
	@PutMapping(produces= "application/json", consumes= "application/json")
	public void crear(@RequestBody @Valid Cliente cliente) {
		this.service.crear(cliente);
	}
	
	@PostMapping(produces= "application/json", consumes= "application/json")
	public void actualizar(@RequestBody @Valid Cliente cliente) {
		this.service.actualizar(cliente);
	}
	
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") int id) {
		this.service.eliminar(id);
	}
	
	@GetMapping("/{id}")
	public void obtener(int id) {
		
	}
	
	@GetMapping("/{nombre}")
	public ResponseEntity<List<Cliente>> obtener(@PathVariable("nombre") String nombre ) {
		List<Cliente> clientes = new ArrayList<>();
		clientes = service.obtenerClientePorNombre(nombre);
		return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);

	}
	
}
