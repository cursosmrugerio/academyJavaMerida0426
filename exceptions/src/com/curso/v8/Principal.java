package com.curso.v8;

class DividendoNoNegativos extends Exception{
	DividendoNoNegativos(String msg){
		super(msg);
	}
}

class XnoMayor1000 extends Exception{
	XnoMayor1000(String msg){
		super(msg);
	}
}


public class Principal {

	public static void main(String[] args) {
		int x = 1008;
		int y = 2;
		int r = 0;
		
		try {
			r = dividir(x,y);
		}catch(UnsupportedOperationException | XnoMayor1000 | DividendoNoNegativos  e) {
			e.printStackTrace();
		}

		
		System.out.println("Resultado: "+r);
		
		System.out.println("END PROGRAM");

	}

	private static int dividir(int x, int y) throws DividendoNoNegativos, XnoMayor1000 {		
		
		int resultado;
		
		if (y==0)
			throw new UnsupportedOperationException("No se puede dividir entre 0");
		else if (y<0)
			throw new DividendoNoNegativos("Y no puede ser menor a Cero");
		else if (x>1000)
			throw new XnoMayor1000("X no mayor a 1000");
		resultado = x / y;
		
		return resultado;
		
	}

}
