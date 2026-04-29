package com.curso.v4;

@FunctionalInterface
public interface Predicado<T> {
	
	boolean probar(T t);
	
	//NO SE PUEDE PORQUE DEBE TENER
	//UN SOLO METODO abstract
	//void calcular();
	
	//METODOS CON COMPORTAMIENTO
	//default - n
	//static - n

}
