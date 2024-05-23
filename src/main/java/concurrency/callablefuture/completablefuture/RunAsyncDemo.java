package ru.aston.java.base.lesson7.concurrency.callablefuture.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class RunAsyncDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Запуск параллельного потока без получения результата
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            // Simulate a long-running Job
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("I'll run in a separate thread than the main thread.");
        });


    }
}
