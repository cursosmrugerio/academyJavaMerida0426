package com.curso.v0;

import java.util.*;

public class Principal6 {

	public static void main(String[] args) {
		
		System.out.println("V6");
				
		Student stu1 = new Student("Patrobas", 40);		
		Student stu2 = new Student("Filologo", 30);
		Student stu3 = new Student("Andronico", 35);
		Student stu4 = new Student("Tercio", 32);
		Student stu5 = new Student("Epeneto", 38);
		
		List<Student> estudiantes = new ArrayList<>();
		estudiantes.add(stu1);
		estudiantes.add(stu2);
		estudiantes.add(stu3);
		estudiantes.add(stu4);
		estudiantes.add(stu5);
		
		//Consumer
		estudiantes.forEach(t -> System.out.println(t));
		
		//Predicate
		estudiantes.removeIf(x -> x.getName().contains("e"));
		
		System.out.println("**********");
		
		estudiantes.forEach(t -> System.out.println(t));
		
		System.out.println("**********");
		
		//UnaryOperator
		estudiantes.replaceAll(emp -> {
			emp.setMarks(emp.getMarks()+100);
			return emp;}
		);
		
		estudiantes.forEach(System.out::println);
		
		System.out.println("**********");
		//Comparator
		estudiantes.sort((e1,e2)->e2.getMarks()-e1.getMarks());
		estudiantes.forEach(System.out::println);
		
		System.out.println("**********");
		//Comparator
		estudiantes.sort(Comparator.comparing(Student::getName).reversed());
		estudiantes.forEach(System.out::println);
		
	}

}
