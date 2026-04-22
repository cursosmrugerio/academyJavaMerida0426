package com.curso.v7;

interface AmazingInterface {
	//public static final
	String value = "amazing"; 
	//public abstract
	void amazingMethod(String arg);
}

abstract class AmazingClass implements AmazingInterface {
	static String value = "awesome";
	abstract void amazingMethod(String arg1, String arg2);
}

public class Awesome extends AmazingClass implements AmazingInterface {
	@Override
	public void amazingMethod(String arg1) {
	}
	@Override
	public void amazingMethod(String arg1, String arg2) {
	}

	public static void main(String[] args) {
		AmazingInterface ai = new Awesome();
		
		//ai.amazingMethod(value);
		//((AmazingClass)ai).amazingMethod("x1", value);
		
		//ai.amazingMethod(AmazingInterface.value);
		//((AmazingClass)ai).amazingMethod(AmazingInterface.value, AmazingClass.value);
	}

}