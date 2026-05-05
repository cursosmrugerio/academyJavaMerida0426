package com.curso.v0;

import java.util.function.Supplier;

class Estudiante{}

public class Principal {
	
	public static void main(String[] args) {
		
		Estudiante est;
		
		Supplier<Estudiante> supplier = ()->new Estudiante();	
		est = supplier.get();
		System.out.println(est);
		
	}

}
