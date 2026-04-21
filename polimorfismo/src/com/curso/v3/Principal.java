package com.curso.v3;

class Animal{
	void makeSound(){
		System.out.println("Animal sound!!!");
	}
}

class Perro extends Animal{
	@Override
	void makeSound(){
		System.out.println("Guau guau!!!");
	}
}

class Gato extends Animal{
	@Override
	void makeSound(){
		System.out.println("Miau miau!!!");
	}
}

class Pato extends Animal{
	@Override
	void makeSound(){
		System.out.println("Quak quak!!!");
	}
}


public class Principal {

	public static void main(String[] args) {
		//VARIABLES LOCALES SE DEBEN DE INICIALIZAR 
		Animal animal = null;
		animal.makeSound(); //NullPointerException

	}

}
