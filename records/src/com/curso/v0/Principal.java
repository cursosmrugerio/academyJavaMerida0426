package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		//Constructor
		Estudiante e1 = new Estudiante("Patrobas",
				20,
				85.0);
		
		Estudiante e2 = new Estudiante("Patrobas",
				20,
				85.0);
		
		//equals
		System.out.println(e1.equals(e2)); //true
		
		//toString
		System.out.println(e1);
		
		//GETTERS
		System.out.println(e2.nombre());
		System.out.println(e2.edad());
		System.out.println(e2.promedio());
		
		
	}

}
