package com.curso.v1;

class Ave{} //1

class Pato{ //1
	String name; //null
	
	//UN CONSTRUCTOR NO TIENE VALOR DE RETORNO, NO ACEPTA void
	Pato(String nombre){
		name = nombre;
	}
	//YA NO SE CREA CONSTRUCTOR DEFAULT
	Pato(){}
}

public class Principal {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");
		
		//System.out.println(sb1.equals(sb2)); //false
		
		Pato pato1 = new Pato("Donald");
		System.out.println(pato1.name); //Lucas
		
		Ave ave1 = new Ave();
		Pato pato2 = new Pato();
		
		
		
	}

}
