package com.curso.v2;

class Animal{
	void makeSound(){
		System.out.println("Animal sound!!!");
	}
}

class Perro extends Animal{
	void makeSound(){
		System.out.println("Guau guau!!!");
	}
}

class Gato extends Animal{
	void makeSound(){
		System.out.println("Miau miau!!!");
	}
}

class Pato extends Animal{
	void makeSound(){
		System.out.println("Quak quak!!!");
	}
}


public class Principal {

	public static void main(String[] args) {
		
		Pato pato = new Pato();
		//pato.makeSound();
		
		//pato = new Animal();
		//pato = new Gato();
		
		Animal animal;
		
		animal = new Perro();
		animal.makeSound();
		
		animal = new Gato();
		animal.makeSound();
		
		animal = new Animal();
		animal.makeSound();
		
		animal = new Pato();
		animal.makeSound();

	}

}
