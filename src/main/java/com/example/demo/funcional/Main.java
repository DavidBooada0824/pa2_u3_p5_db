package com.example.demo.funcional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class Main {

	public static void main(String[] args) {
		System.out.println("********************Implemantaicon de Interfaces Funcionales mediante librerias JAVA");

		System.err.println("1. Supplier");
		Stream<String> lista = Stream.generate(() -> "1720030723" + "pais").limit(20);
		lista.forEach(cadena -> System.out.println(cadena));

		System.err.println("2. Consume Java");
		List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 67, 8, 5, 4, 85, 74);
		listaNumeros.forEach(numero -> {
			System.out.println("se inserta");
			System.out.println(numero);
		});

		System.err.println("3. Predicate Java");
		Stream<Integer> listaFiltrada = listaNumeros.stream().filter(numero -> numero >= 10);
		listaFiltrada.forEach(numero -> System.out.println(numero));

		System.err.println("3. Funtion Java");
		Stream<String> listaCambiada = listaNumeros.stream().map(numero -> {
			numero = numero - 100 / 50;
			return "Num: " + numero.toString();
		});

		listaCambiada.forEach(cadena -> System.out.println(cadena));
		
		Ciudadano ciu1 = new Ciudadano();
		ciu1.setApellido("Boada");
		ciu1.setProvincia("Pichincha");
		ciu1.setNombre("David");
		
		Ciudadano ciu2 = new Ciudadano();
		ciu2.setApellido("Boada");
		ciu2.setProvincia("Pichincha");
		ciu2.setNombre("Marlon");
		
		Ciudadano ciu3 = new Ciudadano();
		ciu3.setApellido("Boada");
		ciu3.setProvincia("Pichincha");
		ciu3.setNombre("Clare");
		
		List<Ciudadano> listaCiudadano = Arrays.asList(ciu1,ciu2,ciu3);
		Stream<Empleado> listaEmpleados =listaCiudadano.stream().map(ciudadano -> {
			Empleado empl01 = new Empleado();
			empl01.setNombreCompleto(ciudadano.getNombre() + " " + ciudadano.getApellido());
			if (ciudadano.getProvincia().compareTo("pichincha") == 0) {
				empl01.setPais("Ecuador");
			}
			return empl01;
		});
		listaEmpleados.forEach(empleado -> System.out.println(empleado));
		
		//5. Unary Operation
		
		System.out.println("----------------------------------  UNARY OPERATOR JAVA  ---------------------------------");
		Stream<Integer> listaNumeros2 = listaNumeros.stream().map(numero -> {
			numero = numero *100 / 50;
			return numero;
		});
		listaNumeros2.forEach(cadena -> System.out.println(cadena));
		
	}

}
