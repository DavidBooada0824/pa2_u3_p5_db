package com.example.demo.ventas.repo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_facuctura")

public class DetalleFactura {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_autor")
	@SequenceGenerator(name = "seq_autor", sequenceName = "seq_autor", allocationSize = 1)
	@Column(name = "deta_id")
	private Integer id;
	@Column(name = "deta_cantidad")
	private Integer cantidad;
	@Column(name = "deta_codigo_barras")
	private String codigoBarras;
	@Column(name = "deta_nombre_producto")
	private String nombreProducto;

	@ManyToOne
	@JoinColumn(name = "deta_id_factura")
	private Factura factura;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return "DetalleFactura [id=" + id + ", cantidad=" + cantidad + ", codigoBarras=" + codigoBarras
				+ ", nombreProducto=" + nombreProducto + "]";
	}

}
