package com.curso.v2;

public class Imagen extends Observer{
	
	public Imagen(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	void showImage() {
		System.out.println("Muestra imagen");
	}

	@Override
	public void update() {
		showImage();
	}

}
