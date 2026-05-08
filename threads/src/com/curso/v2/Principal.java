package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V2"); //EJECUTA HILO main
		
		new Thread(()-> System.out.println("Runnable 1")).start();
		
		System.out.println("Fin de Programa"); //EJECUTA HILO main
		
	}

}
