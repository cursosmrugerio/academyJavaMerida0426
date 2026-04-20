package com.curso.v0;

class Ave{
	void volar() {
		System.out.println("volar Ave");
	}
}

class Pato extends Ave{
	void volar() {
		System.out.println("volar Pato");
	}
}

class PatoSalvaje extends Pato{
	void volar() {
		System.out.println("volar Pato Salvaje");
	}
}

public class Principal {
	
	public static void main(String[] args) {
		Ave ave = new Ave();
		ave.volar(); //volar Ave 
		
		ave = new Pato();
		ave.volar(); //volar Pato
		
		ave = new PatoSalvaje();
		ave.volar(); //volar Pato Salvaje
		
		Ave ps = new PatoSalvaje();
		ps = new Ave();
		ps = new Pato();
		
	}

}
