package com.example.demo.ventas.service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.ventas.repo.modelo.Factura;
import com.example.demo.ventas.repo.modelo.dto.FacturaDTO;

public interface IFacturaService {

	public Factura buscarPorNumero(String numero);

	public void guardar(Factura factura);

	public int modificarFecha(LocalDate fechaNueva, LocalDate fechaActual);

	public void actualizar(Factura factura);

	public void eliminar(Integer id);

	public int borrarPorNumero(String numero);

	public List<FacturaDTO> buscarFacturasDTO();

}
