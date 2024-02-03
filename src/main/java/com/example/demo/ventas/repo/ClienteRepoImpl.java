package com.example.demo.ventas.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.ventas.repo.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ClienteRepoImpl implements IClienteRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Cliente cliente) {
		this.entityManager.persist(cliente);

	}

}
