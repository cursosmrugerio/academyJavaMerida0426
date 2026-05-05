package com.curso.v0;

public class Principal {
	
	public static void main(String[] args) {
		
		Texto obs1 = new Texto();
		
		Mouse mouse = new Mouse();
		mouse.click();
		
		mouse.attach(obs1);
		mouse.click();
		
		mouse.attach(new Imagen());
		mouse.click();
		
		mouse.detach(obs1);
		mouse.attach(new Gif("Banana"));
		mouse.attach(new Scrollbar());
		mouse.click();
		
	}

}
