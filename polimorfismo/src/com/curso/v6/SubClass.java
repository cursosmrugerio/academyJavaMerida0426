package com.curso.v6;

class BaseClass {
	public void print(String s) {
		System.out.println("BaseClass :" + s);
	}
}

class SubClass extends BaseClass {
	@Override
	public void print(String s) {
		System.out.println("SubClass :" + s);
		// Line 1
		super.print(s);
	}

	public static void main(String args[]) {
		SubClass sc = new SubClass();
		sc.print("location");
	}
}