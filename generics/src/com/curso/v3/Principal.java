package com.curso.v3;

class Bici{}
class Moto{}
class Patineta{}

class ContenedorBici{
	Bici bici;
}

class ContenedorMoto{
	Moto moto;
}

class ContenedorPatineta{
	Patineta patineta;
}

public class Principal {
	public static void main(String[] args) {
		Bici bici = new Bici();
		Moto moto = new Moto();
		Patineta patineta = new Patineta();
		
		ContenedorMoto cm = new ContenedorMoto();
		cm.moto = moto;
		
	}
}
