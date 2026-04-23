package com.curso.v0;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("V0");
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
