package com.curso.v3.algoritmo;

public class NoVolar implements ComportamientoVolar {

	@Override
	public void ejecutaVuelo() {
		System.out.println("No Volar");
	}

}
