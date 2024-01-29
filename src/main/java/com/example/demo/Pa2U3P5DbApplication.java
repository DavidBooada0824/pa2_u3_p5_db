package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ventas.repo.modelo.Habitacion;
import com.example.demo.ventas.repo.modelo.Hotel;
import com.example.demo.ventas.service.IHabitacionService;
import com.example.demo.ventas.service.IHotelService;

@SpringBootApplication
public class Pa2U3P5DbApplication implements CommandLineRunner {

	@Autowired
	private IHabitacionService iHabitacionService;

	@Autowired
	private IHotelService iHotelService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5DbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Hotel hote = new Hotel();

		hote.setDireccion("Dos Puentes");
		hote.setNombre("Cielo");

		Habitacion habi = new Habitacion();

		List<Habitacion> habitaciones = new ArrayList<>();

		habi.setClase("Premiun");
		habi.setHotel(hote);
		habi.setNumero("A1");
		habitaciones.add(habi);

		Habitacion habi2 = new Habitacion();
		habi2.setClase("Popular");
		habi2.setHotel(hote);
		habi2.setNumero("A2");
		habitaciones.add(habi2);

		hote.setHabitaciones(habitaciones);

		// this.iHotelService.ingresar(hote);

		System.err.println("\t_________________Inner Join_____________");

		List<Habitacion> lista = this.iHabitacionService.buscarHabitacionPorNumero("A2");

		for (Habitacion h : lista) {
			System.out.println(h);
		}

		System.err.println("\t\n_________________Right Join_________");

		List<Habitacion> lista1 = this.iHabitacionService.buscarHabitacionPorClase("Normal");

		for (Habitacion h1 : lista1) {
			System.out.println(h1);
		}

		System.err.println("\t\n_________________Left Join________________");

		List<Hotel> lista2 = this.iHotelService.buscarHabitacionPorDireccion("Quito");

		for (Hotel ho : lista2) {
			System.out.println(ho);
			for (Habitacion h : ho.getHabitaciones()) {
				System.out.println(h);
			}
		}

		System.err.println("\t\n_________________Full Join_____________");
		List<Hotel> lista3 = this.iHotelService.buscarHabitacionPorNombre("Risol");
		for (Hotel ho : lista3) {
			System.out.println(ho);
			for (Habitacion h : ho.getHabitaciones()) {
				System.out.println(h);
			}
		}

	}

}
