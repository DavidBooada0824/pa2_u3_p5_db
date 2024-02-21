package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.example.demo.ventas.repo.modelo.Cliente;
import com.example.demo.ventas.service.IClienteService;
import com.example.demo.ventas.service.IFacturaService;

@SpringBootApplication
@EnableAsync
public class Pa2U3P5DbApplication implements CommandLineRunner {
	@Autowired
	private IFacturaService iFacturaService;

	@Autowired
	private IClienteService iClienteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5DbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(
				"\n------------------------------------------- HILOS -------------------------------------------");
		System.out.println("Nombre HIlo: " + Thread.currentThread()

				.getName());
//		long tiempoInicial = System.currentTimeMillis();
//		for (int i = 1; i <= 5; i++) {
//			Cliente cliente = new Cliente();
//			cliente.setApellido("B " + i);
//			cliente.setNombre("C " + i);
//			this.iClienteService.guardar(cliente);
//		}
//		long tiempoFinal = System.currentTimeMillis();
//
//		long tiempoTranscurrido = (tiempoFinal - tiempoInicial) / 1000;
//		System.out.println("Tiempo Transcurrido: " + tiempoTranscurrido);

		// Programacion Multihilo
		System.out.println("Nombre HIlo: " + Thread.currentThread()

				.getName());
		List<Cliente> listaCliente = new ArrayList<>();

		long tiempoInicial = System.currentTimeMillis();
		for (int i = 1; i <= 100; i++) {
			Cliente cliente = new Cliente();
			cliente.setApellido("CN " + i);
			cliente.setNombre("Ca " + i);
			listaCliente.add(cliente);

		}
		listaCliente.stream().forEach(cliente -> this.iClienteService.guardar(cliente));
		long tiempoFinal = System.currentTimeMillis();

		long tiempoTranscurrido = (tiempoFinal - tiempoInicial) / 1000;
		System.out.println("Tiempo Transcurrido: " + tiempoTranscurrido);

//		System.out.println("Nombre de Hilo: " + Thread.currentThread().getName());
//		long tiempoInicial = System.currentTimeMillis();
//		List<Cliente> listaCliente = new ArrayList<>();
//		for (int i = 1; i <= 100; i++) {
//			Cliente cliente = new Cliente();
//			cliente.setNombre("CN " + i);
//			cliente.setApellido("CA " + i);
//			listaCliente.add(cliente);
//
//		}
//		listaCliente.parallelStream().forEach(cliente -> this.iClienteService.guardar(cliente));
//		long tiempoFinal = System.currentTimeMillis();
//		long tiempoTotal = (tiempoFinal - tiempoInicial) / 1000;
//		System.out.println("Tiempo transcurrido en segundos " + tiempoTotal);

	}
}
