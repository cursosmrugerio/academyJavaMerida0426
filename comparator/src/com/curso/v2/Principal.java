package com.curso.v2;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {
	
	static String tipoNested = "Static nested class";
	
	static public class ComparatorEdad implements Comparator<Estudiante> {
		@Override
		public int compare(Estudiante e1, Estudiante e2) {
			return e1.getEdad() - e2.getEdad();
		}
	}
	
	static public class ComparatorPromedio implements Comparator<Estudiante> {
		@Override
		public int compare(Estudiante e1, Estudiante e2) {
			return (int)(e1.getPromedio() - e2.getPromedio());
		}
	}
	
	static public class ComparatorNombre implements Comparator<Estudiante> {
		@Override
		public int compare(Estudiante e1, Estudiante e2) {
			return e1.getNombre().compareTo(e2.getNombre());
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("V2");
		
		System.out.println(Principal.tipoNested);
		
		Estudiante[] estudiantes = {
				new Estudiante("Patrobas", 20, 88.90),
				new Estudiante("Andronico", 30, 70.90),
				new Estudiante("Epeneto", 18, 91.90),
				new Estudiante("Filologo", 25, 75.90)
		};
		
		Comparator<Estudiante> comEdad = new Principal.ComparatorEdad();
		Comparator<Estudiante> comPromedio = new Principal.ComparatorPromedio();
		Comparator<Estudiante> comNombre = new Principal.ComparatorNombre();
		
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
