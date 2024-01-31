package com.example.demo.ventas.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ventas.repo.IFacturRepo;
import com.example.demo.ventas.repo.modelo.Factura;
import com.example.demo.ventas.repo.modelo.dto.FacturaDTO;

@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private IFacturRepo iFacturRepo;

	@Override
	public Factura buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.iFacturRepo.selecionarPorNumero(numero);
	}

	@Override
	public void guardar(Factura factura) {
		this.iFacturRepo.insertar(factura);

	}

	@Override
	public int modificarFecha(LocalDate fechaNueva, LocalDate fechaActual) {
		// TODO Auto-generated method stub
		return this.iFacturRepo.actualizarFecha(fechaNueva, fechaActual);
	}

	@Override
	public void actualizar(Factura factura) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public int borrarPorNumero(String numero) {
		return this.iFacturRepo.eliminarPorNumero(numero);
	}

	@Override
	public List<FacturaDTO> buscarFacturasDTO() {
		// TODO Auto-generated method stub
		return this.iFacturRepo.selecionarFacturasDTO();
	}

}
