package com.example.demo.ventas.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ventas.repo.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MateriaRepoImpl implements IMateriaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(Materia materia) {
		this.entityManager.persist(materia);

	}

	@Override
	public List<Materia> seleccionarInnerJoin() {

		TypedQuery<Materia> myQuery = this.entityManager.createQuery("Select m From Materia m Join m.matriculas mt",
				Materia.class);

		List<Materia> lista = myQuery.getResultList();
		for (Materia m : lista) {
			m.getMatriculas().size();
		}

		return lista;
	}

	@Override
	public List<Materia> seleccionarRightJoin() {
		TypedQuery<Materia> myQuery = this.entityManager
				.createQuery("Select m From Materia m Right Join m.matriculas mt", Materia.class);

		List<Materia> lista = myQuery.getResultList();
		for (Materia m : lista) {
			m.getMatriculas().size();
		}

		return lista;
	}

	@Override
	public List<Materia> seleccionarLeftJoin() {
		TypedQuery<Materia> myQuery = this.entityManager
				.createQuery("Select m From Materia m Left Join m.matriculas mt", Materia.class);

		List<Materia> lista = myQuery.getResultList();
		for (Materia m : lista) {
			m.getMatriculas().size();
		}

		return lista;
	}

	@Override
	public List<Materia> seleccionarFullJoin() {
		TypedQuery<Materia> myQuery = this.entityManager
				.createQuery("Select m From Materia m Full Join m.matriculas mt", Materia.class);

		List<Materia> lista = myQuery.getResultList();
		for (Materia m : lista) {
			m.getMatriculas().size();
		}

		return lista;
	}

	@Override
	public List<Materia> seleccionarMateriaFetchJoin() {
		TypedQuery<Materia> myQuery = this.entityManager
				.createQuery("SELECT m FROM Materia m JOIN FETCH m.matriculas mt", Materia.class);

		return myQuery.getResultList();
	}

}
