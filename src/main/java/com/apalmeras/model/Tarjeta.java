package com.apalmeras.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tarjeta")
public class Tarjeta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTarjeta;

	@Column(name = "numtarjeta", nullable = false, length = 8)
	private Long numtarjeta;

	@Size(min = 3, max = 4)
	// @Column(name = "ccv", nullable = false)
	private String ccv;

	@Column(name = "tiptarjeta", nullable = false, length = 50)
	private String tiptarjeta;

	@ManyToOne
	@JoinColumn(name = "id_cliente", nullable = false)
	private Cliente cliente;
	
	
	
	public int getIdTarjeta() {
		return idTarjeta;
	}

	public void setIdTarjeta(int idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public Long getNumtarjeta() {
		return numtarjeta;
	}

	public void setNumtarjeta(Long numtarjeta) {
		this.numtarjeta = numtarjeta;
	}

	public String getCcv() {
		return ccv;
	}

	public void setCcv(String ccv) {
		this.ccv = ccv;
	}

	public String getTiptarjeta() {
		return tiptarjeta;
	}

	public void setTiptarjeta(String tiptarjeta) {
		this.tiptarjeta = tiptarjeta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	

	
	
	
	
}
