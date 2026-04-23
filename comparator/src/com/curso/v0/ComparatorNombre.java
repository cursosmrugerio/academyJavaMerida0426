package com.curso.v0;

import java.util.Comparator;

public class ComparatorNombre implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante e1, Estudiante e2) {
		return e1.getNombre().compareTo(e2.getNombre());
	}
	
	
}
