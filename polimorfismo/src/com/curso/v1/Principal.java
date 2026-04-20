package com.curso.v1;

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

		Object ave = new Pato();
		
		((Ave)ave).volar(); 
		
	}

}
