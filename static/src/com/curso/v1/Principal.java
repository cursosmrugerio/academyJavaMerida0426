package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Alumno.contador); //0
		
		Alumno alum1 = new Alumno("Patrobas");
		
		System.out.println(Alumno.contador); //1
		
		Alumno alum2 = new Alumno("Andronico");
		
		System.out.println(Alumno.contador); //2
		
		Alumno alum3 = new Alumno("Epeneto");
		
		System.out.println(alum1.nombre); //Patrobas
		System.out.println(alum2.nombre); //Andronico
		System.out.println(alum3.nombre); //Epeneto
		
		System.out.println(Alumno.contador); //3
		
		//System.out.println(alum1.contador); //3
		//System.out.println(alum2.contador); //3
		//System.out.println(alum3.contador); //3
	}

}
