package com.curso.v1;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		
		List<String> listaAlumnos = new ArrayList<>();
		
		listaAlumnos.add("Patrobas");
		listaAlumnos.add("Filologo");
		//listaAlumnos.add(new Object());
		//listaAlumnos.add(Integer.valueOf(5));
		
		for(String nombre:listaAlumnos) {
			nombre = nombre.concat("@");
			System.out.println(nombre);
		}
		
	}

}
