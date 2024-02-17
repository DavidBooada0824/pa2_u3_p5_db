package com.example.demo.funcional;

public class PersonaSupplierImpl implements IPersonaSupplier<String>{

	@Override
	public String getId() {

		String cedula ="1720030723";
		
		cedula= cedula+"provincia";
		return cedula;
	}

}
