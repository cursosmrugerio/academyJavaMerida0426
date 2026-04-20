package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		String animal1 = new String("lion");
		String animal2 = new String("tiger");
		String animal3 = new String("bear");

		animal3 = animal1;
		animal2 = animal3;
		animal1 = animal2; 
	}

}
