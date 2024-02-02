package com.example.demo.ventas.repo;

import java.util.List;

import com.example.demo.ventas.repo.modelo.Matricula;

public interface IMatriculaRepo {

	public void crear(Matricula matricula);

	public List<Matricula> seleccionarInnerJoin();

	public List<Matricula> seleccionarRightJoin();

	public List<Matricula> seleccionarLeftJoin();

	public List<Matricula> seleccionarFullJoin();

	public List<Matricula> seleccionarMatriculaFetchJoin();

}
