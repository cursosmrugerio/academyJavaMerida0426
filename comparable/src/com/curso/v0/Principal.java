package com.curso.v0;

import java.util.Arrays;

public class Principal {
	
	public static void main(String[] args) {
		
		String[] datos = {"abc", "ABC", "09", "1", "aZ"};
		
		Arrays.sort(datos);
		
		System.out.println(Arrays.toString(datos));
		
		//09, 1, ABC, aZ, abc 
		
		String s1 = "09";
		String s2 = "aZ";
		
		int i;
		 
		i = s1.compareTo(s2);
		System.out.println(i); //signo negativo
		
		String s3 = "abc";
		String s4 = "1";
		
		i = s3.compareTo(s4);
		System.out.println(i); //signo positivo
		
		String s5 = "ABC";
		String s6 = "ABC";
		
		i = s5.compareTo(s6);
		System.out.println(i); //0
		
		
		
	}

}
