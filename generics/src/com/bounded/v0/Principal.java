package com.bounded.v0;

import java.util.*;

public class Principal {
	
	//UNBOUNDED WILDCARD
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add(new Object());
		list.add("Hola");
		list.add(Double.valueOf(5.0));
		//show(list);
		showUnbounded(list);
		
		List<String> listString = new ArrayList<>();
		listString.add("A");
		listString.add("B");
		listString.add("C");
		//show(listString); //DON'T COMPILE
		showUnbounded(listString);
		
		List<Double> listDouble = new ArrayList<>();
		listDouble.add(5.0);
		listDouble.add(2.0);
		listDouble.add(1.7);
		//show(listDouble); //DON'T COMPILE
		showUnbounded(listDouble);
	}
	
	static void show(List<Object> lista) {
		for(Object o:lista)
			System.out.println(o);
	}
	
	static void showUnbounded(List<?> lista) {
		for(Object o:lista)
			System.out.println(o);
		System.out.println("*****");
	}

}
