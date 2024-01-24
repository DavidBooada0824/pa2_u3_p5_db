package com.example.demo.ventas.repo;

import com.example.demo.ventas.repo.modelo.Factura;

public interface IFacturRepo {
	
	public Factura selecionarPorNumero(String numero);
	
	public void insertar (Factura factura);
	

}
