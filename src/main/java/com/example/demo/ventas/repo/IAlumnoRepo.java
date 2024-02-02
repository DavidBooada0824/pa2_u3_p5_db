package com.example.demo.ventas.repo;

import java.util.List;

import com.example.demo.ventas.repo.modelo.Alumno;

public interface IAlumnoRepo {

	public void crear(Alumno alumno);

	public List<Alumno> seleccionarInnerJoin();

	public List<Alumno> seleccionarRightJoin();

	public List<Alumno> seleccionarLeftJoin();

	public List<Alumno> seleccionarFullJoin();

	public List<Alumno> seleccionarAlumnoFetchJoin();

}
