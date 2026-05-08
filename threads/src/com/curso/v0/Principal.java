package com.curso.v0;

class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("Runnable 1");
	}
}

public class Principal {

	public static void main(String[] args) {

		Runnable run1 = new MyRunnable();
		
		Thread hilo1 = new Thread(run1);
		
		hilo1.start(); //EJECUTO HILO 1
		
		System.out.println("Fin de Programa"); //EJECUTA HILO main
		
	}

}
