package com.book.v0;

import java.util.stream.Stream;

public class Principal2 {

	public static void main(String[] args) {
		Stream<String> stream = Stream.iterate("", (s) -> s + "1");
		
		Stream<String> stream2 = stream.limit(2).map(x -> x + "2");
		
		stream2.forEach(System.out::println);
		
		System.out.println(stream2);
		
		//       //2
		//1      //12
		
		
		
	}
}
