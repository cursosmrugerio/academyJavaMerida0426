package com.curso.v4;

class Ave{
} 

class Pato extends Ave{ 
}

public class Principal {

	public static void main(String[] args) {
		
		Ave ave1 = new Ave();
		Pato pato1 = new Pato();
		Ave ave2 = new Pato();
		
		
		
		
		
		
		
		String s1 = "Hola";
		Object o = s1;
		s1 = "Hello";
		System.out.println(o);
		
		System.out.println("*******");
		
		StringBuilder sb1 = new StringBuilder("Hola");
		Object o2 = sb1;
		sb1.append(" Mundo");
		System.out.println(o2);
		
		
	}

}
