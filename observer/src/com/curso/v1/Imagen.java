package com.curso.v1;

public class Imagen extends Observer{
	
	public Imagen(Subject subject) {
		super(subject);
	}

	void showImage() {
		System.out.println("Muestra imagen");
	}

	@Override
	public void update() {
		showImage();
	}

}
