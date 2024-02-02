package com.example.demo.ventas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ventas.repo.IMateriaRepo;
import com.example.demo.ventas.repo.modelo.Materia;

@Service
public class MateriaServiceImpl implements IMateriaService {

	@Autowired
	private IMateriaRepo iMateriaRepo;

	@Override
	public void ingresar(Materia materia) {
		this.iMateriaRepo.crear(materia);

	}

	@Override
	public List<Materia> buscarInnerJoin() {
		// TODO Auto-generated method stub
		return this.iMateriaRepo.seleccionarInnerJoin();
	}

	@Override
	public List<Materia> buscarRightJoin() {
		// TODO Auto-generated method stub
		return this.iMateriaRepo.seleccionarRightJoin();
	}

	@Override
	public List<Materia> buscarLeftJoin() {
		// TODO Auto-generated method stub
		return this.iMateriaRepo.seleccionarLeftJoin();
	}

	@Override
	public List<Materia> buscarFullJoin() {
		// TODO Auto-generated method stub
		return this.iMateriaRepo.seleccionarFullJoin();
	}

	@Override
	public List<Materia> buscarMateriaFetchJoin() {
		// TODO Auto-generated method stub
		return this.iMateriaRepo.seleccionarMateriaFetchJoin();
	}

}
