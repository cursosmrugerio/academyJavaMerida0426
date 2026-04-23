package com.curso.v4;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {
		
	public static void main(String[] args) {
		System.out.println("V4");
		String tipoNested = "Anonymous class";
		System.out.println(tipoNested);
		
		Comparator<Estudiante> comparatorEdad = new Comparator<>() {
			@Override
			public int compare(Estudiante o1, Estudiante o2) {				
				return o1.getEdad() - o2.getEdad();
			}
		};
		
		Comparator<Estudiante> comparatorPromedio = new Comparator<>() {
			@Override
			public int compare(Estudiante o1, Estudiante o2) {				
				return (int)(o1.getPromedio() - o2.getPromedio());
			}
		};
		
		
		
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
		Arrays.sort(estudiantes,  new Comparator<>() {
			@Override
			public int compare(Estudiante o1, Estudiante o2) {				
				return o2.getNombre().compareTo(o1.getNombre());
			}
		});
		for (Estudiante e:estudiantes)
			System.out.println(e);
	}

}
