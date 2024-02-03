package com.example.demo.ventas.repo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name ="cliente")
public class Cliente {
	@Id
	@SequenceGenerator(name = "seq_clie",sequenceName = "sep_clie",allocationSize = 1)
	@GeneratedValue(generator = "seq_clie",strategy = GenerationType.SEQUENCE)
	@Column(name="clie_id")
	private Integer id;
	@Column(name="clie_nombre")
	private String nombre;
	@Column(name="clie_apellido")
	private String apellido;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	

}
