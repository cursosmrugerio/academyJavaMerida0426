package com.curso.v4;

class Bici{}
class Moto{}
class Patineta{}

class Contenedor{
	Bici bici;
	Moto moto;
	Patineta patineta;
}


public class Principal {
	public static void main(String[] args) {
		Bici bici = new Bici();
		Moto moto = new Moto();
		Patineta patineta = new Patineta();
		
		Contenedor cm = new Contenedor();
		cm.bici = bici;
		cm.moto = moto;
		
	}
}
