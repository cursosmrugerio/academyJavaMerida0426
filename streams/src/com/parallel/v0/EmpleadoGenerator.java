package com.parallel.v0;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Empleado{
	private String nombre; 
	private int edad; 
	private double sueldo;
	
	public Empleado(String nombre, int edad, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
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

public class EmpleadoGenerator {

    public static List<Empleado> generarEmpleados() {
        String[] nombres = {
            "Miguel", "Sofía", "Carlos", "María", "Juan", "Ana", "Luis", "Laura",
            "Pedro", "Carmen", "Jorge", "Lucía", "Roberto", "Patricia", "Diego",
            "Fernanda", "Ricardo", "Gabriela", "Andrés", "Valeria", "Fernando",
            "Daniela", "Alejandro", "Mariana", "Eduardo", "Isabel", "Raúl", "Paola"
        };

        String[] apellidos = {
            "García", "Rodríguez", "Martínez", "Hernández", "López", "González",
            "Pérez", "Sánchez", "Ramírez", "Torres", "Flores", "Rivera", "Gómez",
            "Díaz", "Reyes", "Morales", "Cruz", "Ortiz", "Gutiérrez", "Chávez",
            "Ramos", "Ruiz", "Mendoza", "Castillo", "Jiménez", "Vargas", "Romero"
        };

        List<Empleado> empleados = new ArrayList<>(5000);
        Random random = new Random();

        for (int i = 0; i < 20_000_000; i++) {
            String nombre = nombres[random.nextInt(nombres.length)] + " " +
                            apellidos[random.nextInt(apellidos.length)] + " " +
                            apellidos[random.nextInt(apellidos.length)];

            int edad = 18 + random.nextInt(48); // 18 a 65 años

            // Sueldo entre 8,000 y 80,000 con 2 decimales
            double sueldo = Math.round((8000 + random.nextDouble() * 72000) * 100.0) / 100.0;

            empleados.add(new Empleado(nombre, edad, sueldo));
        }

        return empleados;
    }
}