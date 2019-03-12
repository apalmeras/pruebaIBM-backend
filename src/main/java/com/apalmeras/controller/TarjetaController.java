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

import com.apalmeras.model.Tarjeta;
import com.apalmeras.service.ITarjetaService;

@RestController
@RequestMapping("/tarjetas")
public class TarjetaController {
	
	@Autowired
	private ITarjetaService service;
	
	

	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Tarjeta>> listar() {
		List<Tarjeta> tarjetas = new ArrayList<>();
		tarjetas = service.listar();
		return new ResponseEntity<List<Tarjeta>>(tarjetas, HttpStatus.OK);

	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<Tarjeta> buscar(@PathVariable("id") int id) {
		Tarjeta tarjeta = null;
		tarjeta = service.obtener(id);
		return new ResponseEntity<Tarjeta>(tarjeta, HttpStatus.OK);

	}
	
	@PutMapping(produces= "application/json", consumes= "application/json")
	public void crear(@RequestBody @Valid Tarjeta tarjeta) {
		this.service.crear(tarjeta);
	}
	
	@PostMapping(produces= "application/json", consumes= "application/json")
	public void actualizar(@RequestBody @Valid Tarjeta tarjeta) {
		this.service.actualizar(tarjeta);
	}
	
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") int id) {
		this.service.eliminar(id);
	}
	
	@GetMapping("/{id}")
	public void obtener(int id) {
		
	}
	
	
	
}
