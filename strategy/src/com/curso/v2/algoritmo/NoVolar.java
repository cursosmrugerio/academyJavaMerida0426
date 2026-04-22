package com.curso.v2.algoritmo;

public class NoVolar implements ComportamientoVolar {

	@Override
	public void ejecutaVuelo() {
		System.out.println("No Volar");
	}

}
