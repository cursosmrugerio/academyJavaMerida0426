package com.curso.v2;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("V2");
		
		Mouse mouse = new Mouse();
		mouse.click();
		
		Texto obs1 = new Texto(mouse);
		mouse.click();

		new Imagen(mouse);
		mouse.click();
		
		mouse.detach(obs1);
		new Gif("Banana",mouse);
		new Scrollbar(mouse);
		mouse.click();
		
	}

}
