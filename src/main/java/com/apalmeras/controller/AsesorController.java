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

import com.apalmeras.model.Asesor;
import com.apalmeras.service.IAsesorService;

@RestController
@RequestMapping("/asesores")
public class AsesorController {

	@Autowired
	private IAsesorService service;
	
	
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Asesor>> listar() {
		List<Asesor> asesores = new ArrayList<>();
		asesores = service.listar();
		return new ResponseEntity<List<Asesor>>(asesores, HttpStatus.OK);

	}
	
	@PutMapping(produces= "application/json", consumes= "application/json")
	public void crear(@RequestBody @Valid Asesor asesor) {
		this.service.crear(asesor);
	}
	
	@PostMapping(produces= "application/json", consumes= "application/json")
	public void actualizar(@RequestBody @Valid Asesor asesor) {
		this.service.actualizar(asesor);
	}
	
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") int id) {
		this.service.eliminar(id);
	}
	
	@GetMapping("/{id}")
	public void obtener(int id) {
		
	}
}
