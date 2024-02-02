package com.example.demo.ventas.repo;

import java.util.List;

import com.example.demo.ventas.repo.modelo.Materia;

public interface IMateriaRepo {

	public void crear(Materia materia);

	public List<Materia> seleccionarInnerJoin();

	public List<Materia> seleccionarRightJoin();

	public List<Materia> seleccionarLeftJoin();

	public List<Materia> seleccionarFullJoin();

	public List<Materia> seleccionarMateriaFetchJoin();

}
