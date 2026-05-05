package com.curso.v5;

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

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]";
	}
}

public class Principal {
	
	public static void main(String[] args) {
		
		Estudiante e1 = new Estudiante("Patrobas",20);
		Estudiante e2 = new Estudiante("Andronico",18);
		Estudiante e3 = new Estudiante("Patrobas",20);
		Estudiante e4 = new Estudiante("Filologo",25);
		
		Set<Estudiante> set = new TreeSet<>(
				Comparator.comparing(Estudiante::getNombre));
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		
		set.forEach(System.out::println);
		
	}

}
