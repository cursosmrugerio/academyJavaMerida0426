package com.curso.v4;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("*** "+Thread.currentThread().getName()+" ***"); //main

		Runnable printInventory = () -> 
			System.out.println(Thread.currentThread().getName() +", Printing zoo inventory");
		
				

		Runnable printRecords = () -> {
			for (int i = 0; i < 3; i++)
				System.out.println("Printing record: " + i);
		};
		
		System.out.println("begin"); //Thread main
		
		new Thread(printInventory,"Inventory 1").start(); //<==
		new Thread(printRecords).start();
		new Thread(printInventory,"Inventory 2").start(); //<==
		
		System.out.println("end"); //Thread main

	}

}
