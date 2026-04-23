package com.curso.v0;

import java.util.Comparator;

public class ComparatorEdad implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante e1, Estudiante e2) {
		return e1.getEdad() - e2.getEdad();
	}
	
	
}
