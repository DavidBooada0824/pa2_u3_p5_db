package com.example.demo.ventas.service;

import java.util.List;

import com.example.demo.ventas.repo.modelo.Hotel;

public interface IHotelService {

	public void ingresar(Hotel hotel);

	public Hotel selecionar(Integer id);

	public void actualizar(Hotel hotel);

	public void borrar(Integer id);

	public List<Hotel> buscarHabitacionPorDireccion(String direccion);

	//
	public List<Hotel> buscarHabitacionPorNombre(String nombre);

}
