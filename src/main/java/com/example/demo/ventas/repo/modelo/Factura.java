package com.example.demo.ventas.repo.modelo;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_factura")
	@SequenceGenerator(name = "seq_factura", sequenceName = "seq_factura", allocationSize = 1)
	@Column(name = "fac_")
	private Integer id;

	@Column(name = "fac_numero")
	private String numero;
	@Column(name = "fac_fecha")
	private LocalDate fecha;
	@Column(name = "fac_cedula")
	private String cedula;

	@OneToMany(mappedBy = "factura", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<DetalleFactura> detalles;

	public List<DetalleFactura> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetalleFactura> detalles) {
		this.detalles = detalles;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", numero=" + numero + ", fecha=" + fecha + ", cedula=" + cedula + ", detalles="
				+ detalles + "]";
	}

}
