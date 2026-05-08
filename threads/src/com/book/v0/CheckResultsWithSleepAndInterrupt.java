package com.book.v0;

public class CheckResultsWithSleepAndInterrupt {
	private static int counter = 0;

	public static void main(String[] a) {
		
		final Thread mainThread = Thread.currentThread();
		
		new Thread(() -> { //SEGUNDO HILO
			for (int i = 0; i < 100_000_000; i++)
				counter++;
			//INTERRUMPE AL HILO main DE SU SUEÑO
			mainThread.interrupt();
		}).start();

		while (counter < 100_000_000) {
			System.out.println("Not reached yet");
			try {
				Thread.sleep(1); // 1 SECOND
			} catch (InterruptedException e) {
				System.out.println("******Interrupted Sueño!*****");
			} catch (IllegalArgumentException e) {
				System.out.println("******Tiempo Negativo********");
			}
		}

		System.out.println("Reached: " + counter);
	}
}