package com.curso.v0;

public class Gif implements Observer {
	
	String imagen;

	public Gif(String imagen) {
		this.imagen = imagen;
	}
	
	void showGif() {
		System.out.println("Mostrar gif: "+imagen );
	}

	@Override
	public void update() {
		showGif();
	}

}
