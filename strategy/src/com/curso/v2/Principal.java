package com.curso.v2;

import com.curso.v2.algoritmo.*;

public class Principal {
	
	public static void main(String[] args) {
		
		ComportamientoVolar cv1 = new SiVolar();
		ComportamientoVolar cv2 = new NoVolar();
		ComportamientoVolar cv3 = new AleatorioVolar();
		
		Ave ave = new Pato();
		
		ave.cv = cv2;
		
		ave.volar();
		
		ave.cv = cv1;
		
		ave.volar();
		
		ave.cv = cv3;
		
		ave.volar();

	}
	

}
