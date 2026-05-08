package com.curso.v0;

import java.util.concurrent.CyclicBarrier;

class ItemProcessor extends Thread {
	CyclicBarrier cb; //HAS-A

	//Dependency Inyection 
	public ItemProcessor(CyclicBarrier cb) {
		this.cb = cb;
	}

	@Override
	public void run() {
		System.out.println("processed");
		try {
			cb.await();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

class Merger implements Runnable {
	@Override
	public void run() {
		System.out.println("Value Merged");
	}
}

public class CyclicBarrierDemo {
	public static void main(String[] args) throws Exception {
		Merger m = new Merger();

		// LINE 3: barrera con 2 partes y Merger como acción de barrera
		CyclicBarrier cb = new CyclicBarrier(2, m);

		ItemProcessor ip = new ItemProcessor(cb);
		ip.start(); // LINE 4
		cb.await();

		// (Opcional) Esperar a que el worker termine antes de salir
		// ip.join();
		System.out.println("--- main done ---");
	}
}
