package com.book.v0;

import java.util.ArrayDeque;

public class Principal2 {

	public static void main(String[] args) {

		var greetings = new ArrayDeque<String>();
		
		greetings.offerLast("hello");
		greetings.offerLast("hi");
		greetings.offerFirst("ola");
		
		String s1 = greetings.pop();
		String s2 = greetings.peek();
		
		greetings.forEach(System.out::println);
		
		System.out.println("**********");
		System.out.println("greetings.pop(): "+s1);
		System.out.println("greetings.peek(): "+s2);
		
		
		
		
		
	}

}
