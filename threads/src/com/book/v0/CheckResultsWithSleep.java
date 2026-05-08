package com.book.v0;

public class CheckResultsWithSleep {

	private static int counter = 0;

	public static void main(String[] a) {
		
		new Thread(() -> {
			for (int i = 0; i < 1_000_000; i++) {
				//System.out.println("Counter: "+ counter );
				counter++;
			}
		}).start();
		
		while (counter < 1_000_000) {
			System.out.println("************** Not reached yet ***************");
			try {
				//Hilo main, vete a dormir 1 segundo
				Thread.sleep(1); // 1 SECOND
			} catch (InterruptedException e) {
				System.out.println("Interrupted!");
			}

		}
		
		System.out.println("Reached: " + counter);
	}
}
