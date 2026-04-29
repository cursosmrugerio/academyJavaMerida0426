package com.curso.v3;

@FunctionalInterface
public interface TriPredicado<T,U,V> {
	
	boolean probar(T t,U u, V v);

}
