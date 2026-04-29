package com.curso.v0;

import java.util.*;
import java.util.function.Consumer;

public class Student {
	private String name;
	private int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void addMarks(int m) {
		this.marks += m;
	}

	public void debug() {
		System.out.println("Debug: "+name + ":" + marks);
	}

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {
		List<Student> slist = List.of(new Student("S1", 40), 
				                      new Student("S2", 35), 
				                      new Student("S3", 30));

		for(Student est:slist) {
			System.out.println(est.getName()+ " marks: "+ est.getMarks());
		}
		
		Consumer<Student> increaseMarks = s -> s.addMarks(10);
		for(Student est:slist) {
			increaseMarks.accept(est);
		}
		
//		System.out.println("***********");
//		for(Student est:slist) {
//			System.out.println(est.getName()+ " marks: "+ est.getMarks());
//		}
		
		Consumer<Student> consumer = e -> e.debug();
		for(Student est:slist) {
			consumer.accept(est);
		}
		
		
		//slist.forEach(increaseMarks);
		//slist.forEach(Student::debug);
	}
}