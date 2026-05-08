package com.curso.v0;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Principal {

	public static void main(String[] args)  {

		Runnable r = () -> System.out.println("In Runnable");
		Callable<Integer> c = () -> { System.out.println("In Callable"); return 999; };
        
        ExecutorService es = Executors.newCachedThreadPool();
        
        
        es.submit(r);
        es.submit(c);
        
        es.execute(r); //Only Runnable
        
        Future<Integer> fi1 = es.submit(c);
        
        try {
			System.out.println("Future<Integer> fi1: " + fi1.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
        
        Future<?> fi2 = es.submit(r);
        System.out.println("***Object fi2 : "+fi2);
        Object fi3 = es.submit(r);
        
        
        es.shutdown();
        
		
	}

}
