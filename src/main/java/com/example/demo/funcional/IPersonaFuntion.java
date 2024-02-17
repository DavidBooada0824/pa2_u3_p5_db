package com.example.demo.funcional;

@FunctionalInterface
public interface IPersonaFuntion <T,R> {
	
	public T aplicar(R arg);

}
