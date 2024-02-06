package com.example.demo.ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ventas.repo.IClienteRepo;
import com.example.demo.ventas.repo.IFacturRepo;
import com.example.demo.ventas.repo.modelo.Cliente;
import com.example.demo.ventas.repo.modelo.Factura;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private IFacturRepo iFacturRepo;

	@Autowired
	private IClienteRepo iClienteRepo;

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void guardar(Factura factura, Cliente cliente) {

		System.out.println(
				org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive());

		this.iFacturRepo.insertar(factura);
		this.iClienteRepo.insertar(cliente);

	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void prueba() {
		System.out.println("Este Metodo es de prueba");

		System.out.println(
				org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive());

	}

}
