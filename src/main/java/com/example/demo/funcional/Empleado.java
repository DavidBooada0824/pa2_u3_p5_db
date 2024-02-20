package com.example.demo.funcional;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
public class Empleado {
	private String nombreCompleto;
	private String pais;

	// SET y GET
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Empleado [nombreCompleto=" + nombreCompleto + ", pais=" + pais + "]";
	}

}
