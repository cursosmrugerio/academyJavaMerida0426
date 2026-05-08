package com.parallel.v0;

import java.util.List;

import static com.parallel.v0.EmpleadoGenerator.generarEmpleados;

public class Principal {

	public static void main(String[] args) {

		List<Empleado> empleados = generarEmpleados();
		//System.out.println("Total empleados: " + empleados.size());
		
		long inicio = System.currentTimeMillis();
		
		long totalEmpleados = 
				 //empleados.stream() //1 Thread
				 empleados.parallelStream() //n Threads
				 .map(emp -> {
					 emp.setSueldo(emp.getSueldo()*1.15);
					 return emp;
				 })
				 .count();
		
		long fin = System.currentTimeMillis();
		
		long duracion = fin-inicio;
		
		System.out.println(totalEmpleados + " ,Duracion: "+duracion);

	}

}
