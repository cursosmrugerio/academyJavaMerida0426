package com.curso.v3;

import java.util.*;

class Estudiante{
	
	private String nombre;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]";
	}
}


//Efective final
public class Principal {
	public static void main(String[] args) {
		
		//Effectively final 
		int x = 10;
		
		Comparator<Estudiante> comparator = 
				(e1,e2) -> {
					System.out.println("PASO1");
					e1.setEdad(e1.getEdad() + x);
					return e1.getEdad() - e2.getEdad();
				};
				
		List<Estudiante> listaEstudiantes = new ArrayList<>();
		listaEstudiantes.add(new Estudiante("Patrobas",1));
		listaEstudiantes.add(new Estudiante("Filologo",10));
		
		listaEstudiantes.sort(comparator);
		
		//x = 5;
		
		System.out.println(listaEstudiantes);
		
	}
}
