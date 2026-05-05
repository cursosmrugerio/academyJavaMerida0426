package com.curso.v6;

import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("v6");
		
		Estudiante[] estudiantes = {
				new Estudiante("Patrobas", 20, 88.90),
				new Estudiante("Andronico", 30, 70.90),
				new Estudiante("Epeneto", 17, 91.90),
				new Estudiante("Filologo", 25, 73.90) //***
		};
		
		List<Estudiante> lista = Arrays.asList(estudiantes);
		
		
		Predicado<Estudiante> predicado = 
				Predicado.and(e -> e.getEdad()>20,
						      x -> x.getPromedio()>72.0);
		
		show(lista,predicado);
		
		
		
	}
	
	static void show(List<Estudiante> lista, Predicado<Estudiante> pre) {
		boolean resultado;
		for(Estudiante e: lista) {
			resultado = pre.probar(e); //EJECUTA FUNCION DE ORDEN SUPERIOR
			System.out.println(e.getNombre()+ ": "+resultado);
		}
			
	}

}
