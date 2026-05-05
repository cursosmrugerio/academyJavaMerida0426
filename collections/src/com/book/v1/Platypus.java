package com.book.v1;

import java.util.*;
import java.util.function.ToIntFunction;

public record Platypus(String name, int beakLength) {

	@Override
	public String toString() {
		return ""+beakLength;
	}

	public static void main(String[] args) {
		Platypus p1 = new Platypus("Paula", 3);
		Platypus p2 = new Platypus("Peter", 5);
		Platypus p3 = new Platypus("Peter", 7);

		List<Platypus> list = Arrays.asList(p1, p2, p3);
		
		//                                         (t,u)->t.name.copareTo(u.name)
		//                                     static
		Comparator<Platypus> comp = Comparator.comparing((Platypus::name));
		
		//Platypus -> int
		ToIntFunction<Platypus> tif = x -> x.beakLength;
		
		//                                  default
		Comparator<Platypus> compInt = comp.thenComparingInt(tif);
		
		Collections.sort(list, compInt.reversed());

		System.out.println(list);
	}

}
