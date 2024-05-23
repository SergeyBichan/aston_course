package ru.aston.java.base.lesson7.concurrency.callablefuture.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class ThenApplyDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Создание CompletableFuture
        CompletableFuture<String> whatsYourNameFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println(Thread.currentThread().getName());
            return "Ivanov";
        });

        // Присоединение к предыдущему вызову с использованием thenApply()
        CompletableFuture<String> greetingFuture = whatsYourNameFuture.thenApply(name -> {
            System.out.println(Thread.currentThread().getName());
            return "Hello " + name;
        });
        System.out.println(Thread.currentThread().getName() + " " + "go further");
        // Блокировка и получение результат Future
        System.out.println(Thread.currentThread().getName() + " " + greetingFuture.get());
    }
}
