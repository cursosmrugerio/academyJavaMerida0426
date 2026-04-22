package com.curso.v0;

import java.util.Arrays;

public class Principal2 {
	
	public static void main(String[] args) {
		System.out.println("V0");
		Estudiante[] estudiantes = {
				new Estudiante("Patrobas", 20, 88.90),
				new Estudiante("Andronico", 30, 70.90),
				new Estudiante("Epeneto", 18, 91.90),
				new Estudiante("Filologo", 25, 75.90)
		};
		
		Arrays.sort(estudiantes);
		
		for (Estudiante e:estudiantes)
			System.out.println(e);
	}

}
