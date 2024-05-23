package ru.aston.java.base.lesson7.concurrency.callablefuture;

import java.util.Random;
import java.util.concurrent.Callable;

public class GenerateRandomIntegerCallableTask implements Callable<Integer> {

    private final Random random = new Random();

    @Override
    public Integer call() {
        try {
            Thread.sleep(1000);
            int random = this.random.nextInt(1000) + 1;
            System.out.println("Thread run " + Thread.currentThread().getName() + ". Result " + random);
            return random;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
