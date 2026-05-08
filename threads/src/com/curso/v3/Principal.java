package com.curso.v3;

public class Principal {

	public static void main(String[] args) {

		Runnable printInventory = () -> 
					System.out.println("Printing zoo inventory");

		Runnable printRecords = () -> {
			for (int i = 0; i < 3; i++)
				System.out.println("Printing record: " + i);
		};
		
		System.out.println("begin"); //Thread main
		
		new Thread(printInventory).start(); //
		new Thread(printRecords).start();
		new Thread(printInventory).start(); //
		
		System.out.println("end"); //Thread main

	}

}
