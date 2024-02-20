package com.example.demo.ventas.service;

import java.util.concurrent.TimeUnit;

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
		try {
			System.out.println("Nombre Hilo: " + Thread.currentThread()

			.getName());
			this.iClienteRepo.insertar(cliente);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (Exception e) {
				// TODO: handle exception
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
