package com.curso.v1;

public class Gif extends Observer {
	
	String imagen;

	public Gif(String imagen,Subject sub) {
		super(sub);
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
