package com.curso.v3;

import java.util.function.*;

@FunctionalInterface
interface TriFunction<T,U,R,V>{
	V aplicar(T t,U u, R r);
}

class Estudiante{
	private String nombre;
	private int edad;
	private StringBuilder matricula;
	
	Estudiante(){}

	Estudiante(String nombre) {
		this.nombre = nombre;
	}
	
	Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	Estudiante(String nombre, int edad, StringBuilder matricula) {
		this.nombre = nombre;
		this.edad = edad;
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", matricula=" + matricula + "]";
	}


	
}

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("V3");
		
		Estudiante est;
		
		Supplier<Estudiante> supplier = Estudiante::new; //Supplier
		est = supplier.get();
		System.out.println(est);
		
		Function<String,Estudiante> function = Estudiante::new; //Function
		est = function.apply("Patrobas");
		System.out.println(est);
		
		BiFunction<String,Integer,Estudiante> bifunction = Estudiante::new; //BiFunction
		est = bifunction.apply("Epeneto",20);
		System.out.println(est);
		
		TriFunction<String,Integer,StringBuilder,Estudiante> trifunction = Estudiante::new; //TriFuncion
		est = trifunction.aplicar("Tercio",20, new StringBuilder("XYZ100"));
		System.out.println(est);
		
		TriFunction<String,Integer,StringBuilder,Estudiante> trifunction2 = Estudiante::new ;
		est = trifunction2.aplicar("Filologo",0, null);
		System.out.println(est);
	}

}
