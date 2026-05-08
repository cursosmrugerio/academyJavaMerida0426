package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		Thread hilo1 = new Thread(()-> System.out.println("Runnable 1"));
		
		hilo1.start(); //EJECUTO HILO 1
		
		System.out.println("Fin de Programa"); //EJECUTA HILO main
		
	}

}
