package com.curso.v1;

import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {

		Predicate<Integer> pre =
				i -> i > 10;
				
		System.out.println(pre);
		
		
	}

}
