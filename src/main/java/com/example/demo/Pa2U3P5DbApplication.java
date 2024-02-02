package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ventas.repo.modelo.Alumno;
import com.example.demo.ventas.repo.modelo.Materia;
import com.example.demo.ventas.repo.modelo.Matricula;
import com.example.demo.ventas.service.IAlumnoService;
import com.example.demo.ventas.service.IMateriaService;
import com.example.demo.ventas.service.IMatriculaService;

@SpringBootApplication
public class Pa2U3P5DbApplication implements CommandLineRunner {

	@Autowired
	private IMateriaService iMateriaService;

	@Autowired
	private IMatriculaService iMatriculaService;

	@Autowired
	private IAlumnoService alumnoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5DbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Alumno alu = new Alumno();

		alu.setCedula("1720030723");
		alu.setNombre("David");

		List<Matricula> matriculas = new ArrayList<>();

		Materia mate1 = new Materia();
		mate1.setCreditos(10);
		mate1.setNombre("Fisica");

		Materia mate2 = new Materia();
		mate2.setCreditos(10);
		mate2.setNombre("Programacion");

		// Guardar las materias primero
		// this.iMateriaService.ingresar(mate1);
		// this.iMateriaService.ingresar(mate2);

		Matricula matri = new Matricula();

		matri.setAlumno(alu);
		matri.setCosto(new BigDecimal(100));
		matri.setFecha(LocalDate.now());
		matri.setMateria(mate1);

		matriculas.add(matri);
		alu.setMatriculas(matriculas);

		// Guardar el alumno con la matrícula
		// this.alumnoService.ingresar(alu);

		System.err.println("-------------Deber");
		List<Alumno> alu1 = this.alumnoService.buscarFullJoin();

		//System.out.println(alu1);
		List<Alumno> alu2 = this.alumnoService.buscarInnerJoin();

		//System.out.println(alu2);
		List<Alumno> alu3 = this.alumnoService.buscarLeftJoin();
	//	System.out.println(alu3);
		List<Alumno> alu4 = this.alumnoService.buscarRightJoin();
		//System.out.println(alu4);
		
		List<Alumno> alu5 = this.alumnoService.buscarAlumnoFetchJoin();
		//System.out.println(alu5);

		List<Materia> mater1 = this.iMateriaService.buscarFullJoin();
//
//		System.out.println(mate1);
		List<Materia> mater2 = this.iMateriaService.buscarInnerJoin();
//
//		System.out.println(mate2);
		List<Materia> mater3 = this.iMateriaService.buscarLeftJoin();
//		System.out.println(mater3);
	List<Materia> mater4 = this.iMateriaService.buscarRightJoin();
//		System.out.println(mater4);
//		
		List<Materia> mater5 = this.iMateriaService.buscarMateriaFetchJoin();
//		System.out.println(mater5);

	}

}
