package com.curso.v3;

import com.curso.v3.algoritmo.*;

public class Principal {
	
	public static void main(String[] args) {
		
		ComportamientoVolar cv1 = new SiVolar();
		ComportamientoVolar cv2 = new NoVolar();
		ComportamientoVolar cv3 = new AleatorioVolar();
		
		Ave ave = new Pato();
		System.out.println(ave.getClass().getSimpleName());
		ave.setCv(cv3);
		ave.volar();
		
		ave = new Pinguino();
		System.out.println(ave.getClass().getSimpleName());
		ave.setCv(cv2);
		ave.volar();
		ave.setCv(cv1);
		ave.volar();
		
		ave = new Aguila();
		System.out.println(ave.getClass().getSimpleName());
		ave.volar();
		
		

	}
	

}
