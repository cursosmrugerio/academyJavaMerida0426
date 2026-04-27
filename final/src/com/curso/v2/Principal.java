package com.curso.v2;

class Estudiante{
	void getTutor(final String name){ 
		//name = "Filologo";
		System.out.println("Tutor: "+name);
	}
}



public class Principal {
	public static void main(String[] args) {
		new Estudiante().getTutor("Epeneto");
	}
}
