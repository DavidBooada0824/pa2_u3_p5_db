package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ventas.repo.modelo.DetalleFactura;
import com.example.demo.ventas.repo.modelo.Factura;
import com.example.demo.ventas.repo.modelo.dto.FacturaDTO;
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

		Factura fact = new Factura();

		fact.setCedula("1720030715");
		fact.setFecha(LocalDate.now());
		fact.setNumero("fac01");

		List<DetalleFactura> detalles = new ArrayList<>();

		DetalleFactura deta = new DetalleFactura();

		deta.setCantidad(5);
		deta.setCodigoBarras("cod1");
		deta.setFactura(fact);
		deta.setNombreProducto("pan");

		detalles.add(deta);

		fact.setDetalleFacturas(detalles);

	//	this.facturaService.guardar(fact);

		System.err.println("----------UPDATE----------");
		int cantidad = this.facturaService.modificarFecha(LocalDate.of(2020, 1, 15), LocalDate.of(2024, 1,30));

		System.out.println("Cantidad de registros actualizados");
		System.err.println(cantidad);
		
		System.err.println("----------DELETE----------");
		
		int cantidad2 =this.facturaService.borrarPorNumero("fac01");
		System.out.println("Cantidad de registros actualizados");
		System.err.println(cantidad2);
		
		
		System.err.println("----------DTO----------");
		
		List<FacturaDTO> listaDTO = this.facturaService.buscarFacturasDTO();
		for (FacturaDTO fDTO : listaDTO) {
			System.out.println(fDTO);
			
		}
		
		
		
		
		
		
		
		

	}

}
