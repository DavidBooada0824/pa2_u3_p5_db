package com.example.demo.ventas.repo;

import java.util.List;

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
		fact.getDetalleFacturas().size();
		return fact;
	}

	@Override
	public void insertar(Factura factura) {
		// TODO Auto-generated method stub
		this.entityManager.persist(factura);
	}

	@Override
	public List<Factura> seleccionarInnerJoin() {

		// SQL: Select * From factura f inner join detalle factura d on
		// f.fact_id=d.deta_id_factura
		// JPQL: Select f From Factura f Inner Join f.detalleFactura d

		TypedQuery<Factura> myQuery = this.entityManager.createQuery("Select f From Factura f Join f.detalleFacturas d",
				Factura.class);

		List<Factura> lista = myQuery.getResultList();
		for (Factura f : lista) {
			f.getDetalleFacturas().size();
		}

		return lista;
	}

	@Override
	public List<Factura> seleccionarRightJoin() {
		TypedQuery<Factura> myQuery = this.entityManager
				.createQuery("Select f From Factura f Right Join f.detalleFacturas d", Factura.class);

		List<Factura> lista = myQuery.getResultList();
		for (Factura f : lista) {
			f.getDetalleFacturas().size();
		}

		return lista;
	}

	@Override
	public List<Factura> seleccionarLeftJoin() {
		TypedQuery<Factura> myQuery = this.entityManager
				.createQuery("Select f From Factura f Left Join f.detalleFacturas d", Factura.class);

		List<Factura> lista = myQuery.getResultList();
		for (Factura f : lista) {
			f.getDetalleFacturas().size();
		}

		return lista;
	}

	@Override
	public List<Factura> seleccionarFullJoin() {
		TypedQuery<Factura> myQuery = this.entityManager
				.createQuery("Select f From Factura f full Join f.detalleFacturas d", Factura.class);

		List<Factura> lista = myQuery.getResultList();
		for (Factura f : lista) {
			f.getDetalleFacturas().size();
		}

		return lista;
	}

}
