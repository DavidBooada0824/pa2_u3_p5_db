package com.example.demo.ventas.service;

import com.example.demo.ventas.repo.modelo.Cliente;
import com.example.demo.ventas.repo.modelo.Factura;

public interface IFacturaService {

	public void guardar(Factura factura, Cliente cliente);

}
