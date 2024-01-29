package com.example.demo.ventas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ventas.repo.IHabitacionRepo;
import com.example.demo.ventas.repo.modelo.Habitacion;

@Service
public class HabitacionServiceImpl implements IHabitacionService {

	@Autowired
	private IHabitacionRepo habitacioneRepo;

	@Override
	public void guardarHabitacion(Habitacion habitacion) {
		this.habitacioneRepo.insertar(habitacion);

	}

	@Override
	public Habitacion buscarPorId(Integer id) {

		return this.habitacioneRepo.seleccionar(id);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		this.habitacioneRepo.actualizar(habitacion);

	}

	@Override
	public void eliminar(Integer id) {
		this.habitacioneRepo.eliminar(id);

	}

	@Override
	public List<Habitacion> buscarHabitacionPorNumero(String numero) {

		return this.habitacioneRepo.seleccionarHabitacionPorNumero(numero);
	}

	@Override
	public List<Habitacion> buscarHabitacionPorClase(String clase) {

		return this.habitacioneRepo.seleccionarHabitacionPorClase(clase);
	}

}
