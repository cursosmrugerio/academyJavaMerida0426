package com.curso.v5;

class Ave{
	void volar() {
		System.out.println("Volar Ave");
	}
}

class Aguila extends Ave{
	@Override
	void volar() {
		System.out.println("Volar Aguila");
	}
}

class AguilaReal extends Aguila{
	@Override
	void volar() {
		System.out.println("Volar Aguila Real");
	}
}

class AguilaCalva extends Aguila{
	@Override
	void volar() {
		System.out.println("Volar Aguila Calva");
	}
}

public class Principal {

	public static void main(String[] args) {
		//UPCAST
		AguilaCalva aguilaCalva = new AguilaCalva();
		aguilaCalva.volar();
		
		Aguila aguila = aguilaCalva;
		aguila.volar();
		
		Ave ave = aguila;
		ave.volar();
		
		//DOWNCAST
		Aguila aguila2 = (Aguila)ave;
		aguila2.volar();
		
		
		if (aguila2 instanceof AguilaReal) {
			AguilaReal aguilaReal = (AguilaReal)aguila2;
			aguilaReal.volar(); 
		}
		
		if (aguila2 instanceof AguilaCalva) {
			System.out.println("aguila2 es una instancia de AguilaCalva");
			AguilaCalva aguilaCalvaOtra = (AguilaCalva)aguila2;
			aguilaCalvaOtra.volar(); 
		}
		
		

	}

}
