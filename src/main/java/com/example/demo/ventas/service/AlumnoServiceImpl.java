package com.example.demo.ventas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ventas.repo.IAlumnoRepo;
import com.example.demo.ventas.repo.modelo.Alumno;

@Service
public class AlumnoServiceImpl implements IAlumnoService {

	@Autowired
	private IAlumnoRepo alumnoRepo;

	@Override
	public void ingresar(Alumno alumno) {
		this.alumnoRepo.crear(alumno);
	}

	@Override
	public List<Alumno> buscarInnerJoin() {
		// TODO Auto-generated method stub
		return this.alumnoRepo.seleccionarInnerJoin();
	}

	@Override
	public List<Alumno> buscarRightJoin() {
		// TODO Auto-generated method stub
		return this.alumnoRepo.seleccionarRightJoin();
	}

	@Override
	public List<Alumno> buscarLeftJoin() {
		// TODO Auto-generated method stub
		return this.alumnoRepo.seleccionarLeftJoin();
	}

	@Override
	public List<Alumno> buscarFullJoin() {
		// TODO Auto-generated method stub
		return this.alumnoRepo.seleccionarFullJoin();
	}

	@Override
	public List<Alumno> buscarAlumnoFetchJoin() {
		// TODO Auto-generated method stub
		return this.alumnoRepo.seleccionarAlumnoFetchJoin();
	}

}
