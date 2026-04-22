package com.curso.v6;


class Ave{
	String tipo = "Ave";
	void volar() {
		System.out.println("Volar Ave");
	}
}

class Aguila extends Ave{
	String tipo = "Aguila";
	@Override
	void volar() {
		System.out.println("Volar Aguila");
	}
}

class AguilaReal extends Aguila{
	String tipo = "Aguila Real";
	@Override
	void volar() {
		System.out.println("Volar Aguila Real");
	}
}


public class Principal {

	public static void main(String[] args) {	
		
		Ave ave = new AguilaReal();
		
		ave.volar(); //Volar Aguila Real
		System.out.println(ave.tipo); //Ave
		System.out.println(((AguilaReal)ave).tipo); //Aguila Real
		

	}

}
