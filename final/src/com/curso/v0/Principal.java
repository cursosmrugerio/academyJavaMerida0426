package com.curso.v0;

//final: La clase no se puede heredar
class Estudiante{
	String nombre; //HAS-A
	void getMatricula() {} //final: El método no se puede sobreescribir
	static void getTutor(){}
}

class EstudianteExtranjero extends Estudiante{
	@Override
	void getMatricula() {}
	//@Override //static NO se sobreescribe
	//Hidden (Ocultan)
	static void getTutor(){}
}


public class Principal {

	public static void main(String[] args) {
		
		final int x = 100; //CONSTANTE
		//x = 200;
		
		final Estudiante e1 = new Estudiante();
		
		e1.nombre = "Patrobas";

		System.out.println(e1.nombre);
		
		e1.nombre = "Andronico";
		
		System.out.println(e1.nombre);
		
		//e1 = null;
		//e1 = new Estudiante();
		
		
		
		
	}

}
