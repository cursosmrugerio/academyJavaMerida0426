package com.curso.v6;

interface Transporte{}

class Bici implements Transporte{}
class Moto implements Transporte{}
class Patineta implements Transporte{}

class Contenedor<T extends Transporte>{
	T t;
}

public class Principal {
	public static void main(String[] args) {
		Bici bici = new Bici();
		Moto moto = new Moto();
		Patineta patineta = new Patineta();
		
		Contenedor<Bici> c1 = new Contenedor<>();
		c1.t = bici;
		
		Contenedor<Moto> c2 = new Contenedor<Moto>();
		c2.t = moto;
		
		Contenedor<Patineta> c3 = new Contenedor<>();
		c3.t = patineta;
		
//		Contenedor<StringBuilder> c4 = new Contenedor<>();
//		c4.t = new StringBuilder("Academy");
		
	}
}
