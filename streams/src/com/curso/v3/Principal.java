package com.curso.v3;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.*;

class Empleado{
	
	private String nombre;
	private int edad;
	private double sueldo;
	
	public Empleado(String nombre, int edad, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
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

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}
	
	
	
}

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V3");
		
		List<Empleado> listaEmp = new ArrayList<>(Arrays.asList(
				new Empleado("Patrobas",25,3000.00),
				new Empleado("Andronico",28,1000.00),
				new Empleado("Epeneto",18,2500.00),//*
				new Empleado("Tercio",35,3800.00),
				new Empleado("Rolas",35,3800.00),
				new Empleado("Filologo",19,900.00)//*
		));
		
		//listaEmp = new ArrayList<>();
		
		Stream<Empleado> stream = listaEmp.stream();
		
		//DECLARATIVA
		double suma = stream.filter(x -> x.getEdad()>=25)
							.sorted(Comparator.comparing(Empleado::getNombre))
							.peek(System.out::println)
							.map(Empleado::getSueldo)
							.distinct()
						    .reduce(0.0, (x1,x2) -> x1+x2 );
		
		System.out.println("Suma salarios: "+suma); //11,200 //7,800
		      
		

	}

}
