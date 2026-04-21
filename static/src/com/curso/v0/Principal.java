package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		
		Alumno alum1 = new Alumno("Patrobas");
		Alumno alum2 = new Alumno("Andronico");
		Alumno alum3 = new Alumno("Epeneto");
		
		System.out.println(alum1.nombre); //Patrobas
		System.out.println(alum2.nombre); //Andronico
		System.out.println(alum3.nombre); //Epeneto
		
		System.out.println(alum1.contador); //1
		System.out.println(alum2.contador); //1
		System.out.println(alum3.contador); //1
	}

}
