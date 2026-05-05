package com.curso.v2;

import java.util.*;
import java.util.function.*;

public class Principal {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("a", "aa", "aaa");
		Function<String, Integer> f = x -> x.length();
		Consumer<Integer> c = x -> System.out.print("Len:" + x + " ");
		Predicate<String> p = x -> "".equals(x);
		
		//strList.forEach(c);
	}

}
