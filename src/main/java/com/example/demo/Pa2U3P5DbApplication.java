package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ventas.repo.modelo.Factura;
import com.example.demo.ventas.service.IFacturaService;

@SpringBootApplication
public class Pa2U3P5DbApplication implements CommandLineRunner {

	@Autowired
	private IFacturaService facturaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5DbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.err.println("_______________WHERE JOIN_________________");
		List<Factura> lista = this.facturaService.buscarWhereJoin();

		for (Factura f : lista) {
			System.out.println(lista);
		}

		System.err.println("_______________Fetch JOIN_________________");

		List<Factura> lista2 = this.facturaService.buscarFacturaFetchJoin();
		for (Factura f : lista2) {
			System.out.println(f);
		}

	}

}
