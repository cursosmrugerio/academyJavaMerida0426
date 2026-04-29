package com.curso.v5;

class MyException extends Exception {
}

public class TestClass {
	public static void main(String[] args)  {
		TestClass tc = new TestClass();
		try {
			tc.m1();
		} catch (MyException e) {
			try {
				tc.m1();
			} catch (MyException e1) {
				e1.printStackTrace();
			}
		} finally {
			tc.m2();
			try {
				tc.m1();
			} catch (MyException e) {
				e.printStackTrace();
			}
		}
	}

	public void m1() throws MyException {
		throw new MyException();
	}

	public void m2() throws RuntimeException {
		throw new NullPointerException();
	}
}