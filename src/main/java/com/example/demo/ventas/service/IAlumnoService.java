package com.example.demo.ventas.service;

import java.util.List;

import com.example.demo.ventas.repo.modelo.Alumno;

public interface IAlumnoService {

	public void ingresar(Alumno alumno);

	public List<Alumno> buscarInnerJoin();

	public List<Alumno> buscarRightJoin();

	public List<Alumno> buscarLeftJoin();

	public List<Alumno> buscarFullJoin();

	public List<Alumno> buscarAlumnoFetchJoin();

}
