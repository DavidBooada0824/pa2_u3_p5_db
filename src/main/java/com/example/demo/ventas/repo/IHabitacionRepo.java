package com.example.demo.ventas.repo;

import java.util.List;

import com.example.demo.ventas.repo.modelo.Habitacion;

public interface IHabitacionRepo {

	public Habitacion seleccionar(Integer id);

	public void insertar(Habitacion habitacion);

	public void actualizar(Habitacion habitacion);

	public void eliminar(Integer id);

	// INNER JOIN
	public List<Habitacion> seleccionarHabitacionPorNumero(String numero);

	// RIGTH JOIN
	public List<Habitacion> seleccionarHabitacionPorClase(String clase);

}
