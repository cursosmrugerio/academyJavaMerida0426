package com.book.v0;

import java.util.function.Predicate;

public class Principal3 {

	public static void main(String[] args) {
		
		//Predicate<String> empty = x -> x.isEmpty();
		Predicate<String> empty = String::isEmpty;
		
		Predicate<String> notEmpty = empty.negate();

	}

}
