package com.example.demo.ventas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ventas.repo.IMatriculaRepo;
import com.example.demo.ventas.repo.modelo.Matricula;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepo iMatriculaRepo;

	@Override
	public void ingresar(Matricula matricula) {
		this.iMatriculaRepo.crear(matricula);

	}

	@Override
	public List<Matricula> buscarInnerJoin() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepo.seleccionarInnerJoin();
	}

	@Override
	public List<Matricula> buscarRightJoin() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepo.seleccionarRightJoin();
	}

	@Override
	public List<Matricula> buscarLeftJoin() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepo.seleccionarLeftJoin();
	}

	@Override
	public List<Matricula> buscarFullJoin() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepo.seleccionarFullJoin();
	}

	@Override
	public List<Matricula> buscarMateriaFetchJoin() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepo.seleccionarMatriculaFetchJoin();
	}

}
