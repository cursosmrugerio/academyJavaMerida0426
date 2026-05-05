package com.curso.v2;

public class Gif extends Observer {
	
	String imagen;

	public Gif(String imagen,Subject subject) {
		this.imagen = imagen;
		this.subject = subject;
		this.subject.attach(this);
	}
	
	void showGif() {
		System.out.println("Mostrar gif: "+imagen );
	}

	@Override
	public void update() {
		showGif();
	}

}
