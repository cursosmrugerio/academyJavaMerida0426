package com.curso.v2;

class Ave{
	String name; 
	Ave(String name){
		this.name = name;
	}
} 

class Pato extends Ave{ 
	Pato(String name){
		super(name);
	}
}

public class Principal {

	public static void main(String[] args) {
		
		Pato pato1 = new Pato("Lucas");
		System.out.println(pato1.name);

		
	}

}
