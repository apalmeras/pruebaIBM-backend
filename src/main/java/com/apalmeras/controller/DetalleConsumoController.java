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

import com.apalmeras.model.DetalleConsumo;
import com.apalmeras.service.IDetalleConsumoService;

@RestController
@RequestMapping("/detalleConsumo")
public class DetalleConsumoController {

	@Autowired
	private IDetalleConsumoService service;
	
	

	@GetMapping(produces = "application/json")
	public ResponseEntity<List<DetalleConsumo>> listar() {
		List<DetalleConsumo> detalleConsumo = new ArrayList<>();
		detalleConsumo = service.listar();
		return new ResponseEntity<List<DetalleConsumo>>(detalleConsumo, HttpStatus.OK);

	}
	
	@GetMapping("/tarjeta/{id}")
	public ResponseEntity<List<DetalleConsumo>> detalle(@PathVariable("id") int tarjeta) {
		List<DetalleConsumo> detalleConsumo = new ArrayList<>();
		detalleConsumo = service.obtenerDetalleTarjeta(tarjeta);
		return new ResponseEntity<List<DetalleConsumo>>(detalleConsumo, HttpStatus.OK);

	}
	
	@PutMapping(produces= "application/json", consumes= "application/json")
	public void crear(@RequestBody @Valid DetalleConsumo detalleConsumo) {
		this.service.crear(detalleConsumo);
	}
	
	@PostMapping(produces= "application/json", consumes= "application/json")
	public void actualizar(@RequestBody @Valid DetalleConsumo detalleConsumo) {
		this.service.actualizar(detalleConsumo);
	}
	
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") int id) {
		this.service.eliminar(id);
	}
	
	@GetMapping("/{id}")
	public void obtener(int id) {
		
	}
	
}
