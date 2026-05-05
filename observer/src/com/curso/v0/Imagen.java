package com.curso.v0;

public class Imagen implements Observer{
	
	void showImage() {
		System.out.println("Muestra imagen");
	}

	@Override
	public void update() {
		showImage();
	}

}
