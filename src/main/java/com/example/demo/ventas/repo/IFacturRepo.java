package com.example.demo.ventas.repo;

import java.util.List;

import com.example.demo.ventas.repo.modelo.Factura;

public interface IFacturRepo {

	public Factura selecionarPorNumero(String numero);

	public void insertar(Factura factura);

	public List<Factura> seleccionarInnerJoin();

	public List<Factura> seleccionarRightJoin();

	public List<Factura> seleccionarLeftJoin();

	public List<Factura> seleccionarFullJoin();

	// join where

	public List<Factura> seleccionarFacturaWhereJoin();

	public List<Factura> seleccionarFacturaFetchJoin();

}
