package com.curso.v4;

import java.util.Random;

abstract class Animal{
	abstract void makeSound();
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
		System.out.println("***Abstract***");
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
