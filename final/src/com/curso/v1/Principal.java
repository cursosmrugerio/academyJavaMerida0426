package com.curso.v1;

class Estudiante{
	static void getTutor(){ //Si el método es final no se puede ocultar
		System.out.println("Estudiante getTutor()");
	}
}

class EstudianteExtranjero extends Estudiante{
	//@Override NO SE PUEDE APLICAR 
	//HIDDEN (Ocultar)
	static void getTutor(){
		System.out.println("EstudianteExtranjero getTutor()");
	}
}

public class Principal {

	public static void main(String[] args) {
		//Estudiante.getTutor();
		EstudianteExtranjero.getTutor();
	}

}
