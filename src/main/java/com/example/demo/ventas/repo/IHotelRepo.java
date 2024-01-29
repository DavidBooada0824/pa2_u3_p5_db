package com.example.demo.ventas.repo;

import java.util.List;

import com.example.demo.ventas.repo.modelo.Hotel;

public interface IHotelRepo {

	public void crear(Hotel hotel);

	public Hotel buscar(Integer id);

	public void modificar(Hotel hotel);

	public void elimiar(Integer id);
	
	//LEFT JOIN
		public List<Hotel> seleccionarHabitacionPorDireccion(String direccion);
		//Full JOIN
		public List<Hotel> seleccionarHabitacionPorNombre(String nombre);

}
