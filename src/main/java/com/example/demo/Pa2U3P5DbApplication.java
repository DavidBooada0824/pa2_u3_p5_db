package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ventas.repo.modelo.Cliente;
import com.example.demo.ventas.repo.modelo.Factura;
import com.example.demo.ventas.service.IClienteService;
import com.example.demo.ventas.service.IFacturaService;

@SpringBootApplication
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

		Factura fac = new Factura();

		fac.setCedula("1720030723");
		fac.setFecha(LocalDate.now());
		fac.setNumero("fac01");
		Cliente clie = new Cliente();
		clie.setApellido("Boada");
		clie.setNombre("David");

		this.iFacturaService.guardar(fac, clie);

	}

}
