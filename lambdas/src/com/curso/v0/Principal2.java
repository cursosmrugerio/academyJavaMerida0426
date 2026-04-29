package com.curso.v0;

import java.util.List;

public class Principal2 {

	public static void main(String[] args) {
				
		Student stu1 = new Student("Patrobas", 40);		
		Student stu2 = new Student("Filologo", 30);
		Student stu3 = new Student("Andronico", 35);
		
		List<Student> estudiantes = List.of(stu1,stu2,stu3);
		
		estudiantes.forEach(x -> System.out.println(x));
		
		
	}

}
