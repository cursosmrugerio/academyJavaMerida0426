package com.curso.v0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();		
		lista.add("Epeneto");
		lista.add("Filologo");
		lista.add("Patrobas");
		lista.forEach(System.out::println);
		System.out.println(lista.getClass().getName());
		
		System.out.println("********");
		lista = Arrays.asList("Epeneto","Filologo");
		//lista.add("Patrobas");
		lista.set(1, "Patrobas");
		lista.forEach(System.out::println);
		System.out.println(lista.getClass().getName());
		
		System.out.println("********");
		lista = List.of("Tercio","Rolas");
		//lista.add("Patrobas");
		//lista.set(1, "Patrobas");
		lista.forEach(System.out::println);
		System.out.println(lista.getClass().getName());
		
		System.out.println("********");
		lista = new ArrayList<>(lista);
		lista.add("Patrobas");
		lista.set(1, "Patrobas");
		lista.forEach(System.out::println);
		
	}

}
