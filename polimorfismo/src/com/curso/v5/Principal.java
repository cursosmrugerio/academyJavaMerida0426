package com.curso.v5;

import java.util.Random;

//public -> protected -> default* -> private

interface Animal{
	//public abstract
	void makeSound();
}

class Perro implements Animal{
	@Override
	public void makeSound(){
		System.out.println("Guau guau!!!");
	}
}

class Gato implements Animal{
	@Override
	public void makeSound(){
		System.out.println("Miau miau!!!");
	}
}

class Pato implements Animal{
	@Override
	public void makeSound(){
		System.out.println("Quak quak!!!");
	}
}


public class Principal {

	public static void main(String[] args) {
		System.out.println("***Interface***");
		Animal animal = getAnimal();
		animal.makeSound(); //Polimorfismo
		
	}

	private static Animal getAnimal() {
		
		Animal[] animals = new Animal[] {
				//new Animal(), //0
				new Pato(), //1
				new Perro(), //2
				new Gato() //3
		};
		
		int aleatorio = new Random().nextInt(animals.length);		
		return animals[aleatorio];
	}

}
