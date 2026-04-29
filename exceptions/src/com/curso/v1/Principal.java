package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		int x = 8;
		int y = 0;
		int r = 0;
		
		try {
			r = dividir(x,y);
		}catch(ArithmeticException e) {
			System.out.println("No se puede dividir entre 0");
		}
		
		
		System.out.println("Resultado: "+r);
		
		System.out.println("END PROGRAM");

	}

	private static int dividir(int x, int y) {		
		
		int resultado;
		
		resultado = x / y;
		
		return resultado;
		
	}

}
