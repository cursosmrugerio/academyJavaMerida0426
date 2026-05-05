package com.curso.v0;

import java.util.Optional;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(1,2,3,4,0,-4);
		stream.forEach(System.out::println);
		System.out.println("*********");
	
		stream = Stream.of(1,2,3,4,0,-4);
		stream = Stream.of();
		Optional<Integer> opt = stream.max((x,y)->x-y);
		System.out.println(opt);
		
		//System.out.println(opt.get());
		System.out.println(opt.orElse(Integer.MIN_VALUE));
	}

}
