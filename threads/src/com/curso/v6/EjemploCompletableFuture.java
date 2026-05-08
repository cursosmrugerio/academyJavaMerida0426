package com.curso.v6;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class EjemploCompletableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Hilo main inicia: " + Thread.currentThread().getName());

        // supplyAsync ejecuta la tarea en otro hilo y promete devolver un valor
        CompletableFuture<String> futuro = CompletableFuture.supplyAsync(() -> {
            System.out.println("Tarea corriendo en: " + Thread.currentThread().getName());
            try {
                Thread.sleep(10_000); // simula trabajo pesado
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Resultado desde el hilo secundario";
        });

        // get() bloquea el hilo main hasta que el futuro termine
        String resultado = futuro.get();

        System.out.println("Main recibió: " + resultado);
        System.out.println("Hilo main termina: " + Thread.currentThread().getName());
    }
}