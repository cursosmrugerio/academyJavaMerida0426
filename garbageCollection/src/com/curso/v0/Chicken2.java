package com.curso.v0;

public class Chicken2 {
	
	private Integer eggs = 2;  //HAS-A 
	
	{ this.eggs = 3; }
	
	public Chicken2(int eggs) {
		this.eggs = eggs;
	}
	
	public static void main(String[] args) {
		Chicken2 c1 = new Chicken2(1);
		var c2 = new Chicken2(2);
		var c3 = new Chicken2(3);
		
		//Cuantos Objetos?? 6
		
		c1.eggs = c2.eggs;
		c2 = c1;
		c3.eggs = null;
		
		boolean b1 = c1.eggs == c2.eggs; //true
		
		System.out.println(b1);
		System.out.println(c3.eggs);
		
		
	}
	

}
