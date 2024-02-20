package com.example.demo.funcional;

import jakarta.persistence.Entity;

@Entity

public class Ciudadano {

	private String nombre;
	private String apellido;
	private String provincia;

	// set y get
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

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Ciudadano [nombre=" + nombre + ", apellido=" + apellido + ", provincia=" + provincia + "]";
	}

}