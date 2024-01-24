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
import com.example.demo.ventas.service.IFacturaService;

@SpringBootApplication
public class Pa2U3P5DbApplication implements CommandLineRunner {

	@Autowired
	private IFacturaService iFacturaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5DbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Factura fac = new Factura();
		fac.setCedula("12345");
		fac.setFecha(LocalDate.now());
		fac.setNumero("0001-02569");

		DetalleFactura det1 = new DetalleFactura();
		det1.setCantidad(4);
		det1.setCodigoBarras("1478");
		det1.setFactura(fac);
		det1.setNombreProducto("CocaCola");

		DetalleFactura det2 = new DetalleFactura();
		det2.setCantidad(2);
		det2.setCodigoBarras("2589");
		det2.setFactura(fac);
		det2.setNombreProducto("Leche Vita");

		List<DetalleFactura> detalle = new ArrayList<>();

		detalle.add(det1);
		detalle.add(det2);

		fac.setDetalles(detalle);

		// this.iFacturaService.guardar(fac);

		Factura consu1 = this.iFacturaService.buscarPorNumero("0001-02569");
		System.err.println("Su facutura" + fac.getNumero());
		System.out.println("\t" + consu1);

	}

}
