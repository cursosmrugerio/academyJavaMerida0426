package com.curso.v6;

public class Zoo1 {

	public static void pause() {
		try {
			Thread.sleep(10_000); //2: Sleep 10 segs
		} catch (InterruptedException e) {
		}
		System.out.println("Thread finished! "+Thread.currentThread().getName()); //3
	}

	public static void main(String[] unused) {
		Thread job = new Thread(() -> pause());
		job.setDaemon(true);
		job.start(); 
		System.out.println("Main method finished!");//1
	}
}