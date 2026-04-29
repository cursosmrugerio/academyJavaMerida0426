package com.curso.v0A;

class EsMayor18 implements Predicado{
	@Override
	public boolean probar(Estudiante est) {
		return est.getEdad()>=18;
	}
}

class EsAprobado implements Predicado{
	@Override
	public boolean probar(Estudiante pato) {
		return pato.getPromedio()>=7.5;
	}
}

public class Principal {

	public static void main(String[] args) {
		
		Estudiante estPatrobas = new Estudiante("Patrobas",15,89);
		
		Predicado predicado = new EsMayor18();
		
		boolean res = predicado.probar(estPatrobas);
		
		System.out.println(estPatrobas.getNombre()+" es mayor edad?: "+res);
		
		Estudiante estEpeneto = new Estudiante("Epeneto",20,74);
		
		res = predicado.probar(estEpeneto);
		
		System.out.println(estEpeneto.getNombre()+" es mayor edad?: "+res);
		
		predicado = new EsAprobado();
		
		res = predicado.probar(estEpeneto);
		
		System.out.println(estEpeneto.getNombre()+" aprobo?: "+res);
		

	}

}
