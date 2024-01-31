package com.example.demo.ventas.repo;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.ventas.repo.modelo.Factura;
import com.example.demo.ventas.repo.modelo.dto.FacturaDTO;

public interface IFacturRepo {

	public Factura selecionarPorNumero(String numero);

	public void insertar(Factura factura);

	public int actualizarFecha(LocalDate fechaNueva, LocalDate fechaActual);

	public void actualizar(Factura factura);

	public void eliminar(Integer id);

	public int eliminarPorNumero(String numero);

	public Factura selecionar(Integer id);

	public List<FacturaDTO> selecionarFacturasDTO();

}
