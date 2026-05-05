package com.curso.v0;

public class Scrollbar implements Observer{
	
	void desplazar() {
		System.out.println("Scrollbar desplazar");
	}

	@Override
	public void update() {
		desplazar();
	}

}
