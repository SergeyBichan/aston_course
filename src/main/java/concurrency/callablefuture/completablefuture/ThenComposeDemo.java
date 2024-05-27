package concurrency.callablefuture.completablefuture;

import concurrency.callablefuture.completablefuture.model.CreditRatingService;
import concurrency.callablefuture.completablefuture.model.User;
import concurrency.callablefuture.completablefuture.model.UserService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenComposeDemo {
    public CompletableFuture<User> getUsersDetail(String userId) {
        return CompletableFuture.supplyAsync(() -> {
            return UserService.getUserDetails(userId);
        });
    }

    public CompletableFuture<Double> getCreditRating(User user) {
        return CompletableFuture.supplyAsync(() -> {
            return CreditRatingService.getCreditRating(user);
        });
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThenComposeDemo thenComposeDemo = new ThenComposeDemo();
        // Присоединение к предыдущему вызову без вложенности с использованием thenCompose()
        CompletableFuture<Double> future = thenComposeDemo.getUsersDetail("1")
                .thenCompose(thenComposeDemo::getCreditRating);

        Double result = future.get();
        System.out.println(result);
    }
}
