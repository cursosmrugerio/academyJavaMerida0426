package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V3");
		
		Estudiante estPatrobas = new Estudiante("Patrobas",15,89);
		
		Predicado<Estudiante> predicado = x -> x.getEdad() > 18;
		
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
		
		System.out.println("*************");
		
		String lenguage = "Javaxscript";
		
		Predicado<String> predicado2 = r -> r.contains("x");
		
		System.out.println(lenguage +" : "+predicado2.probar(lenguage));
		
		lenguage = "PHP";
		
		System.out.println(lenguage +" : "+predicado2.probar(lenguage));
		
		System.out.println("*************");
		
		TriPredicado<String,StringBuilder,Integer> triPredicado = 
			(gato1,gato2,gato3) -> gato2.toString().concat(gato1).length() > gato3;
			
		res = triPredicado.probar("Javascript", new StringBuilder("PHP"), 8);
		
		System.out.println(res);
		

	}

}
