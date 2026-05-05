package com.curso.v0;

import java.util.Optional;

public class Principal5 {

	public static void main(String[] args) throws Exception{

		Optional<String> opt = Optional.empty();
		
		//String cadena = opt.orElseThrow();
		//String cadena = opt.orElseThrow(()->  new Exception());
		//String cadena = opt.orElseThrow(RuntimeException::new);
		//String cadena = opt.get();
		String cadena = opt.orElse("X");
		
		System.out.println(cadena);
	}

	

}
