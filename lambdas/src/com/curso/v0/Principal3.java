package com.curso.v0;

import java.util.List;
import java.util.function.Consumer;

public class Principal3 {
	
	static int contador;

	public static void main(String[] args) {
				
		Student stu1 = new Student("Patrobas", 40);		
		Student stu2 = new Student("Filologo", 30);
		Student stu3 = new Student("Andronico", 35);
		
		List<Student> estudiantes = List.of(stu1,stu2,stu3);
		
		Consumer<Student> consumer = x -> {
				contador++;
				System.out.print("Contador: "+contador+", ");
				System.out.println(x);
				return;
		};
		
		estudiantes.forEach(consumer);
		
		
	}

}
