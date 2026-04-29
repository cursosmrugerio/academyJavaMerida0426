package com.curso.v0;

import java.util.function.BiFunction;

public class Principal5 {
	
	public static void main(String[] args) {
		//            T  ,   U   ,     R
		BiFunction<String,Integer,StringBuilder> bf0 =
				(x,u) -> new StringBuilder("a");
		StringBuilder sb = bf0.apply("UNO", 8 );
		//System.out.println(sb);
		
		//            T  ,   U   ,     R
		BiFunction<String,Integer,StringBuilder> bf1 =
				(q,t) -> new StringBuilder(q.length() + t +"");
				
		sb = bf1.apply("UNO", 8 );
		System.out.println(sb); //11
		
		System.out.println("StringBuilder Capacity");
		StringBuilder sb2 = new StringBuilder(10);
		sb2.append("1234567890XYZ");
		System.out.println(sb2);
		
				
	}

}
