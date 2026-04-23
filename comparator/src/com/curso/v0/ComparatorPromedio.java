package com.curso.v0;

import java.util.Comparator;

public class ComparatorPromedio implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante pato1, Estudiante pato2) {
		//INVIERTO EL PROMEDIO
		return (int)(pato2.getPromedio() - pato1.getPromedio());
	}
	
	
}
