package com.book.v0;

import java.util.List;
import java.util.function.Predicate;

public class Principal0 {
	
	public static void main(String[] args) {
		List<Integer> lista = List.of(1,2,3,4,5,6,7,8);
		
		Predicate<Integer> pre = i -> i > 4;
		
		lista.stream()
		     .filter(pre.negate())
		     .forEach(System.out::println);
	}

}
