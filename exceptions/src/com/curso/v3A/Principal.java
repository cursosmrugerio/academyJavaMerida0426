package com.curso.v3A;

class ExceptionDividirCero extends RuntimeException{
	ExceptionDividirCero(String msg){
		super(msg);
	}
}

public class Principal {

	public static void main(String[] args) {
		int x = 8;
		int y = 0;
		int r = 0;
		
		try {
			r = dividir(x,y);
		}catch(ExceptionDividirCero e) {
			System.out.println(e);
		}
		
		
		System.out.println("Resultado: "+r);
		
		System.out.println("END PROGRAM");

	}

	private static int dividir(int x, int y) throws ExceptionDividirCero {		
		
		int resultado;
		
		if (y==0)
			throw new ExceptionDividirCero("No se puede dividir entre 0");
		
		resultado = x / y;
		
		return resultado;
		
	}

}
