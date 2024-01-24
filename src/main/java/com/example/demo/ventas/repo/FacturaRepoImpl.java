package com.example.demo.ventas.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.ventas.repo.modelo.Factura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FacturaRepoImpl implements IFacturRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Factura selecionarPorNumero(String numero) {

		TypedQuery<Factura> myQuery = this.entityManager
				.createQuery("SELECT f FROM Factura f WHERE f.numero=:DatoNumero", Factura.class);

		myQuery.setParameter("DatoNumero", numero);
		Factura fact = myQuery.getSingleResult();
		fact.getDetalles().size();
		return fact;
	}

	@Override
	public void insertar(Factura factura) {
		// TODO Auto-generated method stub
		this.entityManager.persist(factura);
	}

}
