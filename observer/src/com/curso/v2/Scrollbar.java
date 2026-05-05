package com.curso.v2;

public class Scrollbar extends Observer{
	
	public Scrollbar(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	void desplazar() {
		System.out.println("Scrollbar desplazar");
	}

	@Override
	public void update() {
		desplazar();
	}

}
