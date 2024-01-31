package com.example.demo.ventas.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ventas.repo.modelo.Factura;
import com.example.demo.ventas.repo.modelo.dto.FacturaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
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
	public int actualizarFecha(LocalDate fechaNueva, LocalDate fechaActual) {
		// TODO Auto-generated method stub

		Query myQuery = this.entityManager
				.createQuery("UPDATE Factura f SET f.fecha = :fechaNueva WHERE f.fecha >= :fechaActual");

		myQuery.setParameter("fechaNueva", fechaNueva);
		myQuery.setParameter("fechaActual", fechaActual);
		return myQuery.executeUpdate();

	}

	@Override
	public void actualizar(Factura factura) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(this.selecionar(id));

	}

	@Override
	public int eliminarPorNumero(String numero) {
		// TODO Auto-generated method stub
		// JPQL DELETE FROM Factura f WHERE f.numero = :numero
		Query myQuery = this.entityManager.createQuery("DELETE FROM Factura f WHERE f.numero = :numero");
		myQuery.setParameter("numero", numero);
		return myQuery.executeUpdate();

	}

	@Override
	public Factura selecionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Factura.class, id);
	}

	@Override
	public List<FacturaDTO> selecionarFacturasDTO() {
		TypedQuery<FacturaDTO> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.example.demo.ventas.repo.modelo.dto.FacturaDTO(f.numero,f.fecha) FROM Factura f",
				FacturaDTO.class);

		return myQuery.getResultList();
	}

}
