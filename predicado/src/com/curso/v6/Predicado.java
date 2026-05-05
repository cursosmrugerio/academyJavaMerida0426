package com.curso.v6;

@FunctionalInterface
public interface Predicado<T> {
	
	boolean probar(T t);
	
	static <W> Predicado<W> and(Predicado<W> pre1,
								Predicado<W> pre2){
		
		//NO EJECUTA LA LAMBDA
		//REGRESAR UNA LAMBDA (FUNCIONES DE ORDEN SUPERIOR)
		return x -> pre1.probar(x) && pre2.probar(x);
		
	}

}
