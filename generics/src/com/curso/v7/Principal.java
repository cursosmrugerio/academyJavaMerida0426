package com.curso.v7;

interface Transporte{}

class Bici implements Transporte{}
class Moto implements Transporte{}
class Patineta implements Transporte{}

class Contenedor<T extends Transporte>{
	private T t;

	public Contenedor(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Contenedor [" + t.getClass().getSimpleName() + "]";
	}
	
}

public class Principal {
	public static void main(String[] args) {
		Bici bici = new Bici();
		Moto moto = new Moto();
		Patineta patineta = new Patineta();
		
		Contenedor<Bici> c1 = new Contenedor<>(bici);
		
		Contenedor<Moto> c2 = new Contenedor<Moto>(moto);
		
		Contenedor<Patineta> c3 = new Contenedor<>(patineta);
		
		System.out.println(c1);
		System.out.println(c2); 
		System.out.println(c3); 
		

		
	}
}
