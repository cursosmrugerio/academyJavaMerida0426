package com.curso.v0;

import java.util.Objects;

class Estudiante {
	String nombre;
	int edad;
	StringBuilder matricula;
	public Estudiante(String nombre, int edad, StringBuilder matricula) {
		this.nombre = nombre;
		this.edad = edad;
		this.matricula = matricula;
	}

	@Override
	public boolean equals(Object obj) {
		Estudiante other = (Estudiante) obj;
		return edad == other.edad && 
			   Objects.equals(matricula.toString(), other.matricula.toString()) && 
			   Objects.equals(nombre, other.nombre);
	}
	
}

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V0");
		
		Estudiante e1 = new Estudiante("Patrobas", 20, new StringBuilder("XYZ100"));
		Estudiante e2 = new Estudiante("Patrobas", 20, new StringBuilder("XYZ100"));
		
		System.out.println(e1.equals(e2)); //true

	}

}
