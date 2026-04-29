package com.curso.v4;


public class Principal {

	public static void main(String[] args) {
		int x = 8;
		int y = 0;
		int r = 0;
		
		r = dividir(x,y);

		
		System.out.println("Resultado: "+r);
		
		System.out.println("END PROGRAM");

	}

	private static int dividir(int x, int y) {		
		
		int resultado;
		
		if (y==0)
			throw new UnsupportedOperationException("No se puede dividir entre 0");
		
		resultado = x / y;
		
		return resultado;
		
	}

}
