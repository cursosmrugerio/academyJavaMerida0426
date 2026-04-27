package com.curso.v0;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		
		List listaAlumnos = new ArrayList();
		
		listaAlumnos.add("Patrobas");
		listaAlumnos.add("Filologo");
		listaAlumnos.add(new Object());
		listaAlumnos.add(Integer.valueOf(5));
		
		for(Object nombre:listaAlumnos) {
			if (nombre instanceof String)
				nombre = ((String)nombre).concat("@");
			System.out.println(nombre);
		}
		
		
	}

}
