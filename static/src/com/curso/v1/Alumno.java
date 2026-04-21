package com.curso.v1;

public class Alumno {
	
	//HAS-A //Variable instancia se inicializan por default
	String nombre; //null
	
	//Variable de Clase se inicializan por default
	static int contador; //0
	
	Alumno(String nombre){
		this.nombre = nombre;
		contador++;
	}

}
