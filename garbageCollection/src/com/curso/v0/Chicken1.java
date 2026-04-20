package com.curso.v0;

public class Chicken1 {
	
	private Integer eggs = 2; //NO TIENE SENTIDO
	
	//Bloques de Instancia (método anonimos)
	//ejecuta antes del Constructor
	{ this.eggs = 3; }
	
	public static void main(String[] args) {
		Chicken1 ch1 = new Chicken1();
		
		System.out.println(ch1.eggs); //3
	}
	

}
