package com.book.v0;

import java.util.List;
import java.util.function.Predicate;

public class Principal0A {
	
	public static void main(String[] args) {
		List<Integer> lista = List.of(1,2,3,4,5,6,7,8);
		
		Predicate<Integer> pre = i -> i > 4;
		Predicate<Integer> pre2 = i -> i%2 == 0;
		
		lista.stream()
		     .filter(pre.or(pre2))
		     .forEach(System.out::println); //2,4,5,6,7,8
	}

}
