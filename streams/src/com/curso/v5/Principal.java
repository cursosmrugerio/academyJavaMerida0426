package com.curso.v5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Principal {
	
	public static void main(String[] args) {
		List<Double> dList = Arrays.asList(10.0, 12.0);

		Consumer<Double> consumer = x -> x= x+10;
		
		dList.stream().forEach(x -> {x= x+10;});
		
		dList.stream().forEach(d->System.out.println(d));
		
		System.out.println("********");
		
		dList.replaceAll(x -> x + 10);
		
		dList.stream().forEach(d->System.out.println(d));
		
		
	}

}
