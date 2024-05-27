package lesson_7.callablefuture.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class SupplyAsync {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Запуск параллельного потока с получением результата
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Result of the asynchronous computation";
        });
        // Блокировка и получение результат Future
        String result = future.get();
        System.out.println(result);
    }
}
