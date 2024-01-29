package com.example.demo.ventas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ventas.repo.IFacturRepo;
import com.example.demo.ventas.repo.modelo.Factura;

@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private IFacturRepo iFacturRepo;

	@Override
	public Factura buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.iFacturRepo.selecionarPorNumero(numero);
	}

	@Override
	public void guardar(Factura factura) {
		this.iFacturRepo.insertar(factura);

	}

	@Override
	public List<Factura> buscarInnerJoin() {
		// TODO Auto-generated method stub
		return this.iFacturRepo.seleccionarInnerJoin();
	}

	@Override
	public List<Factura> buscarRightJoin() {
		// TODO Auto-generated method stub
		return this.iFacturRepo.seleccionarRightJoin();
	}

	@Override
	public List<Factura> buscarLeftJoin() {
		// TODO Auto-generated method stub
		return this.iFacturRepo.seleccionarLeftJoin();
	}

	@Override
	public List<Factura> buscarFullJoin() {
		// TODO Auto-generated method stub
		return this.iFacturRepo.seleccionarFullJoin();
	}

}
