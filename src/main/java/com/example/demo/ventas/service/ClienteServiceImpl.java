package com.example.demo.ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ventas.repo.IClienteRepo;
import com.example.demo.ventas.repo.modelo.Cliente;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepo iClienteRepo;

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void guardar(Cliente cliente) {

		this.iClienteRepo.insertar(cliente);

	}

}
