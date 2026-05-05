package com.curso.v0;

import java.util.Optional;
import java.util.stream.Stream;

public class Principal2 {

	public static void main(String[] args) {
		
		String name = "Patrobas";
		Optional<String> opt = Optional.ofNullable(name);
		System.out.println(opt);
		System.out.println(opt.orElse("default"));
	}

}
