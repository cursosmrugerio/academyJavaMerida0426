package com.curso.v0;


class Pato{
	String name; //null
	
	//UN CONSTRUCTOR NO TIENE VALOR DE RETORNO, NO ACEPTA void
	Pato(String nombre){
		name = nombre;
	}
}

public class Principal1 {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");
		
		//System.out.println(sb1.equals(sb2)); //false
		
		Pato pato1 = new Pato("Donald");
		
		System.out.println(pato1.name); //Lucas
		
	}

}
