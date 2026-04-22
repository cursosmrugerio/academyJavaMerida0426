package com.curso.v1;

public class Principal {
	
	public static void main(String[] args) {
		Ave ave = new Aguila();
		ave.volar();
		
		ave = new Pato();
		ave.volar();
		
		ave = new Pinguino();
		ave.volar();
	}
	

}
