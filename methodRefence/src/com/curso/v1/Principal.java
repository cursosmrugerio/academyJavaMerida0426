package com.curso.v1;

import java.util.function.*;

class Estudiante{
	private String nombre;
	
	Estudiante(){}

	Estudiante(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + "]";
	}
	
}

public class Principal {
	
	public static void main(String[] args) {
		
		Estudiante est;
		
		Supplier<Estudiante> supplier = ()->new Estudiante();	
		est = supplier.get();
		System.out.println(est);
		
		Function<String,Estudiante> function = 
				s -> new Estudiante(s);
		est = function.apply("Patrobas");
		System.out.println(est);
		
		
		
	}

}
