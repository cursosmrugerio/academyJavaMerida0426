package com.curso.v0;

class EsMayor18 implements Predicado{
	@Override
	public boolean probar(Estudiante est) {
		return est.getEdad()>=18;
	}
}

public class Principal {

	public static void main(String[] args) {
		
		Estudiante estPatrobas = new Estudiante("Patrobas",15,8.9);
		
		Predicado predicado = new EsMayor18();
		
		boolean isMayor = predicado.probar(estPatrobas);
		
		System.out.println(estPatrobas.getNombre()+" es mayor edad?: "+isMayor);
		
		Estudiante estEpeneto = new Estudiante("Epeneto",20,7.9);
		
		isMayor = predicado.probar(estEpeneto);
		
		System.out.println(estEpeneto.getNombre()+" es mayor edad?: "+isMayor);
		

	}

}
