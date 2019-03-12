package com.apalmeras.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.NumberFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "detalle_consumo")
public class DetalleConsumo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetalleConsumo;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_tarjeta", nullable = false)
	private Tarjeta tarjeta;

	@JsonFormat(pattern = "dd/MM/yyyy") // ISODate 2018-10-01
	@Column(name = "fecha", nullable=true)
	private LocalDate fecha;

	@Column(name = "descripcion", nullable = false, length = 50)
	private String descripcion;

	@NumberFormat(pattern = "##,###.##")
	@Column(name = "monto", length = 12)
	private BigDecimal monto;

	public int getIdDetalleConsumo() {
		return idDetalleConsumo;
	}

	public void setIdDetalleConsumo(int idDetalleConsumo) {
		this.idDetalleConsumo = idDetalleConsumo;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}	

}
