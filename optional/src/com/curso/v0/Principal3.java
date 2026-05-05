package com.curso.v0;

import java.util.Optional;

public class Principal3 {
	
	public static void main(String[] args) {
		String lang = "Java";
		lang = null;
		
		Optional<String> opt = Optional.ofNullable(lang);
		
		Optional<String> opt2 = opt.map(s -> s.toUpperCase());
		
		String str = opt2.orElse("EMPTY");
		
		System.out.println(str);
		
//		String result = opt.map(s -> s.toUpperCase())
//		                   .orElse("EMPTY");
//		System.out.println(result);
	}

}
