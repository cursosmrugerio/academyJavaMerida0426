package com.curso.v5;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {
		
	public static void main(String[] args) {
		System.out.println("V5");
		String tipoNested = "Lambdas"; //Functional
		System.out.println(tipoNested);
		
		Comparator<Estudiante> comparatorEdad = (o1,o2) -> o1.getEdad()-o2.getEdad();
			
		Comparator<Estudiante> comparatorPromedio = 
					(pato1,pato2) -> (int)(pato1.getPromedio() - pato2.getPromedio());
			
		
		Estudiante[] estudiantes = {
				new Estudiante("Patrobas", 20, 88.90),
				new Estudiante("Andronico", 30, 70.90),
				new Estudiante("Epeneto", 18, 91.90),
				new Estudiante("Filologo", 25, 75.90)
		};
		
		
		System.out.println("**Ordenar por Edad**");
		Arrays.sort(estudiantes, comparatorEdad);
		for (Estudiante e:estudiantes)
			System.out.println(e);
		
		System.out.println("**Ordenar por Promedio**");
		Arrays.sort(estudiantes, comparatorPromedio);
		for (Estudiante e:estudiantes)
			System.out.println(e);
		
		System.out.println("**Ordenar por Nombre**");
		Arrays.sort(estudiantes,  (e1,e2)->e1.getNombre().compareTo(e2.getNombre()));
		for (Estudiante e:estudiantes)
			System.out.println(e);
	}

}
