package com.curso.v1;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {
	
	String tipoNested = "Inner class";
	
	//Inner class: A non-static type defined at the member level of a class
	
	public class ComparatorEdad implements Comparator<Estudiante> {
		@Override
		public int compare(Estudiante e1, Estudiante e2) {
			return e1.getEdad() - e2.getEdad();
		}
	}
	
	public class ComparatorPromedio implements Comparator<Estudiante> {
		@Override
		public int compare(Estudiante e1, Estudiante e2) {
			return (int)(e1.getPromedio() - e2.getPromedio());
		}
	}
	
	public class ComparatorNombre implements Comparator<Estudiante> {
		@Override
		public int compare(Estudiante e1, Estudiante e2) {
			return e1.getNombre().compareTo(e2.getNombre());
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("V1");
		
		System.out.println(new Principal().tipoNested);
		
		Estudiante[] estudiantes = {
				new Estudiante("Patrobas", 20, 88.90),
				new Estudiante("Andronico", 30, 70.90),
				new Estudiante("Epeneto", 18, 91.90),
				new Estudiante("Filologo", 25, 75.90)
		};
		
		Principal principal = new Principal();
		
		Comparator<Estudiante> comEdad = principal.new ComparatorEdad();
		Comparator<Estudiante> comPromedio = principal.new ComparatorPromedio();
		Comparator<Estudiante> comNombre = new Principal().new ComparatorNombre();
		
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
