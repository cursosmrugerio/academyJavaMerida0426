package com.curso.v0;

public class Mouse extends Subject {
	
	void click() {
		System.out.println("Mouse click");
		notificar();
		System.out.println("************");
	}

}
