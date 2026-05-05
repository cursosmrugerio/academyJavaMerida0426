package com.curso.v1;

import java.util.*;

class Estudiante{
	private String nombre;
	private int edad;
	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return edad == other.edad && nombre.equals(other.nombre);
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}

public class Principal {
	
	public static void main(String[] args) {
		
		String n1 = new String("Patrobas");
		String n2 = new String("Andronico");
		String n3 = new String("Patrobas");
		
		Set<String> setString = new HashSet<>();
		setString.add(n1);
		setString.add(n2);
		setString.add(n3);
		
		setString.forEach(System.out::println);
		
		System.out.println("*************");
		
		Estudiante e1 = new Estudiante("Patrobas",20);
		Estudiante e2 = new Estudiante("Andronico",18);
		Estudiante e3 = new Estudiante("Patrobas",20);
		
		Set<Estudiante> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		
		set.forEach(System.out::println);
		
	}

}
