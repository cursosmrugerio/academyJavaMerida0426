package com.curso.v0;

import java.util.function.Consumer;

public class Principal {

	public static void main(String[] args) {
		
		//DEFINICION lambda
		Consumer<Student> consumer = est -> System.out.println(est);
		
		Student stu1 = new Student("Patrobas", 40);
		//EJECUTA lambda
		consumer.accept(stu1);
		
		Student stu2 = new Student("Filologo", 30);
		//EJECUTA lambda
		consumer.accept(stu2);
		
		System.out.println("Fin Programa");
	}

}
