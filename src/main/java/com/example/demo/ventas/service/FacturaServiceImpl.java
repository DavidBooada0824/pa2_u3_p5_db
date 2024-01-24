package com.example.demo.ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ventas.repo.IFacturRepo;
import com.example.demo.ventas.repo.modelo.Factura;

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

}
