package com.curso.v3;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {
		
	public static void main(String[] args) {
		System.out.println("V3");
		String tipoNested = "Local class";
		System.out.println(tipoNested);
		
		class ComparatorEdad implements Comparator<Estudiante> {
			@Override
			public int compare(Estudiante e1, Estudiante e2) {
				return e1.getEdad() - e2.getEdad();
			}
		}
		
		class ComparatorPromedio implements Comparator<Estudiante> {
			@Override
			public int compare(Estudiante e1, Estudiante e2) {
				return (int)(e1.getPromedio() - e2.getPromedio());
			}
		}
		
		class ComparatorNombre implements Comparator<Estudiante> {
			@Override
			public int compare(Estudiante e1, Estudiante e2) {
				return e1.getNombre().compareTo(e2.getNombre());
			}
		}
		
		
		Estudiante[] estudiantes = {
				new Estudiante("Patrobas", 20, 88.90),
				new Estudiante("Andronico", 30, 70.90),
				new Estudiante("Epeneto", 18, 91.90),
				new Estudiante("Filologo", 25, 75.90)
		};
		
		Comparator<Estudiante> comEdad = new ComparatorEdad();
		Comparator<Estudiante> comPromedio = new ComparatorPromedio();
		Comparator<Estudiante> comNombre = new ComparatorNombre();
		
		System.out.println("**Ordenar por Edad**");
		Arrays.sort(estudiantes, comEdad);
		for (Estudiante e:estudiantes)
			System.out.println(e);
		
		System.out.println("**Ordenar por Promedio**");
		Arrays.sort(estudiantes, comPromedio);
		for (Estudiante e:estudiantes)
			System.out.println(e);
		
		System.out.println("**Ordenar por Nombre**");
		Arrays.sort(estudiantes, comNombre);
		for (Estudiante e:estudiantes)
			System.out.println(e);
	}

}
