package com.example.demo.ventas.service;

import java.util.List;

import com.example.demo.ventas.repo.modelo.Matricula;

public interface IMatriculaService {

	public void ingresar(Matricula matricula);

	public List<Matricula> buscarInnerJoin();

	public List<Matricula> buscarRightJoin();

	public List<Matricula> buscarLeftJoin();

	public List<Matricula> buscarFullJoin();

	public List<Matricula> buscarMateriaFetchJoin();

}
