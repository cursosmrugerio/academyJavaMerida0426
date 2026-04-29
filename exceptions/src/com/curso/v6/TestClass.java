package com.curso.v6;

class SomeException extends Exception {
}

class A {
	protected void m() throws SomeException {
	}
}

class B extends A {
	public void m() {
	}
}

public class TestClass {
	public static void main(String[] args) {
		A b = new B();
		((B)b).m();
	}
}
