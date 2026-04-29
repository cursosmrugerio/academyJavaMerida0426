package com.curso.v5;

import java.util.*;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("v5 Predicate");
		
		Estudiante[] estudiantes = {
				new Estudiante("Patrobas", 20, 88.90),
				new Estudiante("Andronico", 30, 70.90),
				new Estudiante("Epeneto", 17, 91.90),
				new Estudiante("Filologo", 25, 73.90)
		};
		
		List<Estudiante> lista = Arrays.asList(estudiantes);
		
		System.out.println("***Es mayor de edad?");
		show(lista, x -> x.getEdad()>=18);

		System.out.println("***aprobo?");
		show(lista, zz -> zz.getPromedio()>75);
		
		System.out.println("***Nombre contiene \"A\"");
		show(lista, t -> t.getNombre().contains("a"));
	}
	
	static void show(List<Estudiante> lista, Predicate<Estudiante> pre) {
		boolean resultado;
		for(Estudiante e: lista) {
			resultado = pre.test(e);
			System.out.println(e.getNombre()+ ": "+resultado);
		}
			
	}

}
