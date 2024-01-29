package com.example.demo.ventas.service;

import java.util.List;

import com.example.demo.ventas.repo.modelo.Habitacion;

public interface IHabitacionService {

	public void guardarHabitacion(Habitacion habitacion);

	public Habitacion buscarPorId(Integer id);

	public void actualizar(Habitacion habitacion);

	public void eliminar(Integer id);

	//
	public List<Habitacion> buscarHabitacionPorNumero(String numero);

	public List<Habitacion> buscarHabitacionPorClase(String clase);

}
