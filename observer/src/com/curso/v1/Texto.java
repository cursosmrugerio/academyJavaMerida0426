package com.curso.v1;

public class Texto extends Observer{
	
	public Texto(Subject subject) {
		super(subject);
	}

	void showTexto() {
		System.out.println("Muestra texto");
	}

	@Override
	public void update() {
		showTexto();
	}

}
