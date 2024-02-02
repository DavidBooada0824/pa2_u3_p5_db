package com.example.demo.ventas.service;

import java.util.List;

import com.example.demo.ventas.repo.modelo.Materia;

public interface IMateriaService {

	public void ingresar(Materia materia);

	public List<Materia> buscarInnerJoin();

	public List<Materia> buscarRightJoin();

	public List<Materia> buscarLeftJoin();

	public List<Materia> buscarFullJoin();

	public List<Materia> buscarMateriaFetchJoin();

}
