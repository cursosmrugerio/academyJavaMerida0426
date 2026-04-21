package com.curso.v3;

class B {
}

class B1 extends B {
}

class B2 extends B {
}

public class ExtendsTest {
	public static void main(String args[]) {
		B b = new B();
		B1 b1 = new B1();
		B2 b2 = new B2();
		
		//b1 = (B1)b; 
		
		//b = b1;
		//b2 = b; //DON'T COMPILE
		//b2 = (B2)b1; //DON'T COMPILE
		//b1 = (B)b1; //DON'T COMPILE
		
		System.out.println("End program");
	}
}