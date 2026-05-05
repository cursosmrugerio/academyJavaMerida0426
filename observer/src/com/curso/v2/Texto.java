package com.curso.v2;

public class Texto extends Observer{
	
	public Texto(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	void showTexto() {
		System.out.println("Muestra texto");
	}

	@Override
	public void update() {
		showTexto();
	}

}
