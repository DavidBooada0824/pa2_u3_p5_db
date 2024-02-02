package com.example.demo.ventas.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ventas.repo.modelo.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepoImpl implements IMatriculaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(Matricula matricula) {
		this.entityManager.persist(matricula);

	}

	@Override
	public List<Matricula> seleccionarInnerJoin() {

		TypedQuery<Matricula> myQuery = this.entityManager.createQuery("Select m From Matricula a Join m.materia m",
				Matricula.class);

		List<Matricula> lista = myQuery.getResultList();

		return lista;
	}

	@Override
	public List<Matricula> seleccionarRightJoin() {

		TypedQuery<Matricula> myQuery = this.entityManager
				.createQuery("Select m From Matricula a Right Join m.materia mt", Matricula.class);

		List<Matricula> lista = myQuery.getResultList();

		return lista;
	}

	@Override
	public List<Matricula> seleccionarLeftJoin() {

		TypedQuery<Matricula> myQuery = this.entityManager
				.createQuery("Select m From Matricula a Left Join m.materia mt", Matricula.class);

		List<Matricula> lista = myQuery.getResultList();

		return lista;
	}

	@Override
	public List<Matricula> seleccionarFullJoin() {
		TypedQuery<Matricula> myQuery = this.entityManager
				.createQuery("SSelect m From Matricula a Full Join m.materia mt", Matricula.class);

		List<Matricula> lista = myQuery.getResultList();

		return lista;
	}

	@Override
	public List<Matricula> seleccionarMatriculaFetchJoin() {

		TypedQuery<Matricula> myQuery = this.entityManager
				.createQuery("SELECT m FROM Matricula m JOIN FETCH m.materia mt", Matricula.class);

		return myQuery.getResultList();
	}

}
