package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		
		Estudiante estPatrobas = new Estudiante("Patrobas",15,89);
		
		Predicado predicado = x -> x.getEdad() > 18;
		
		boolean res = predicado.probar(estPatrobas);
		
		System.out.println(estPatrobas.getNombre()+" es mayor edad?: "+res);
		
		Estudiante estEpeneto = new Estudiante("Epeneto",20,74);
		
		res = predicado.probar(estEpeneto);
		
		System.out.println(estEpeneto.getNombre()+" es mayor edad?: "+res);
		
		predicado = pato -> pato.getPromedio() > 75;
		
		res = predicado.probar(estEpeneto);
		
		System.out.println(estEpeneto.getNombre()+" aprobo?: "+res);
		
		predicado = zz -> zz.getNombre().length() > 6;
		
		res = predicado.probar(estEpeneto);
		
		System.out.println(estEpeneto.getNombre()+" nombre longitud > 6?: "+res);
		

	}

}
