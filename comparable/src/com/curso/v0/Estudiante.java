package com.curso.v0;

public class Estudiante implements Comparable<Estudiante> {
	
	private String nombre;
	private int edad;
	private double promedio;
	
	public Estudiante(String nombre, int edad, double promedio) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.promedio = promedio;
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

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", promedio=" + promedio + "]";
	}

	@Override
	public int compareTo(Estudiante o) {
		if (this.edad < o.edad)
			return -9;
		else if(this.edad > o.edad)
			return 20;
		else 
			return 0;
	}

}
