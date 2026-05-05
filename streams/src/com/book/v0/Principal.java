package com.book.v0;

import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		Stream<String> stream = Stream.iterate("", (s) -> s + "1");
		
		stream.limit(5).forEach(System.out::println);
		
		//
		//1
		//11
		//111
		//1111
		
		
		
	}
}
