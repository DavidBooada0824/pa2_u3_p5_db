package com.example.demo.ventas.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ventas.repo.modelo.Alumno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AlumnoRepoImpl implements IAlumnoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(Alumno alumno) {
		this.entityManager.persist(alumno);

	}

	@Override
	public List<Alumno> seleccionarInnerJoin() {

		TypedQuery<Alumno> myQuery = this.entityManager.createQuery("Select a From Alumno a Join a.matriculas m",
				Alumno.class);

		List<Alumno> lista = myQuery.getResultList();
		for (Alumno a : lista) {
			a.getMatriculas().size();
		}

		return lista;
	}

	@Override
	public List<Alumno> seleccionarRightJoin() {
		TypedQuery<Alumno> myQuery = this.entityManager.createQuery("Select a From Alumno a Right Join a.matriculas m",
				Alumno.class);

		List<Alumno> lista = myQuery.getResultList();
		for (Alumno a : lista) {
			a.getMatriculas().size();
		}

		return lista;
	}

	@Override
	public List<Alumno> seleccionarLeftJoin() {
		TypedQuery<Alumno> myQuery = this.entityManager.createQuery("Select a From Alumno a Left Join a.matriculas m",
				Alumno.class);

		List<Alumno> lista = myQuery.getResultList();
		for (Alumno a : lista) {
			a.getMatriculas().size();
		}

		return lista;
	}

	@Override
	public List<Alumno> seleccionarFullJoin() {
		TypedQuery<Alumno> myQuery = this.entityManager.createQuery("Select a From Alumno a Full Join a.matriculas m",
				Alumno.class);

		List<Alumno> lista = myQuery.getResultList();
		for (Alumno a : lista) {
			a.getMatriculas().size();
		}

		return lista;
	}

	@Override
	public List<Alumno> seleccionarAlumnoFetchJoin() {
		TypedQuery<Alumno> myQuery = this.entityManager.createQuery("SELECT a FROM Alumno a JOIN FETCH a.matriculas mt",
				Alumno.class);

		return myQuery.getResultList();
	}

}
