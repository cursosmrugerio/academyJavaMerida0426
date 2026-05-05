package com.curso.v2;

public class Mouse extends Subject {
	
	void click() {
		System.out.println("Mouse click");
		notificar();
		System.out.println("************");
	}

}
