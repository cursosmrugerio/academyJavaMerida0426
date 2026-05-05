package com.curso.v0;

import java.util.Optional;

public class Principal4 {

	public static void main(String[] args) {

		Optional<String> opt = Optional.empty();
		//opt = Optional.of("Php");
		//System.out.println(opt);
		
		//String cadena = opt.orElse(getCadena());
		String cadena = opt.orElseGet(()->getCadena());
		
		System.out.println(cadena); //PHP
	}

	private static String getCadena() {
		System.out.println("Operación Costosa$$$");
		return "X";
	}

}
