package com.curso.v6;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {
		
	public static void main(String[] args) {
		System.out.println("V6");
		String tipoNested = "Method Reference"; //Functional
		System.out.println(tipoNested);
		
		Comparator<Estudiante> comparatorEdad = Comparator.comparingInt(Estudiante::getEdad);
			
		Comparator<Estudiante> comparatorPromedio = Comparator.comparingDouble(Estudiante::getPromedio);
			
		
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
		Arrays.sort(estudiantes,  Comparator.comparing(Estudiante::getNombre).reversed());
		for (Estudiante e:estudiantes)
			System.out.println(e);
	}

}
