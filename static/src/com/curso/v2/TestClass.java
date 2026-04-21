package com.curso.v2;

public class TestClass {

	public static void main(String args[]) {
		new TestClass();
	}

	public TestClass() {
		System.out.println(this);
		
	}
	
	@Override
	public String toString() {
		return "Soy un TestClass";
	}

}