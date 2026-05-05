package com.curso.v1;

public class Scrollbar extends Observer{
	
	public Scrollbar(Subject subject) {
		super(subject);
	}

	void desplazar() {
		System.out.println("Scrollbar desplazar");
	}

	@Override
	public void update() {
		desplazar();
	}

}
