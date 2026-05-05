package com.book.v0;

import java.util.List;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {
		//List Inmutable
		//Unbounded wildcard, el compilador lo ve como List<Object>
		List<?> q = List.of("mouse", "parrot");
		
		//List Inmutable
		////Unbounded wildcard, el compilador lo ve como List<String>
		var     v = List.of("mouse", "parrot");
		
		//Predicate<String> pre = x -> x.isEmpty();
		
		//q EL COMPILADOR LO TRATA COMO UNA List<Object>
		//q.removeIf(String::isEmpty);
		//q.removeIf(s -> s.length() == 4);
		
		//v EL COMPILADOR LO TRATA COMO UNA List<String>
		//SE GENERA EXCEPTION EN Runtime
		v.removeIf(String::isEmpty);
		v.removeIf(s -> s.length() == 4);
		

	}

}
