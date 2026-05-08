package com.curso.v5;

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
		
		new Thread(printInventory,"Inventory 1").run(); //<==
		new Thread(printRecords).run();
		new Thread(printInventory,"Inventory 2").run(); //<==
		
		System.out.println("end"); //Thread main

	}

}
