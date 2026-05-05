package com.curso.v0;

public class Texto implements Observer{
	
	void showTexto() {
		System.out.println("Muestra texto");
	}

	@Override
	public void update() {
		showTexto();
	}

}
