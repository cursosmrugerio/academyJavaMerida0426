package com.curso.v0;

public class Alumno {
	
	//HAS-A //Variable instancia se inicializan por default
	String nombre; //null
	int contador; //0
	
	Alumno(String nombre){
		this.nombre = nombre;
		contador++;
	}

}
