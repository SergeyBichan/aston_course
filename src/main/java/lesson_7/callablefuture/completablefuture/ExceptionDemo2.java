package lesson_7.callablefuture.completablefuture;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ExceptionDemo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Integer age = -1;
        CompletableFuture<String> maturityFuture = CompletableFuture.supplyAsync(() -> proccess(age))
                .handle((res, ex) -> {
                    if (ex != null) {
                        System.out.println("Oops! We have an exception - " + ex.getMessage());
                        return "Unknown!";
                    }
                    return res;
                });
        ;
        System.out.println("Maturity : " + maturityFuture.get());
    }

    @NotNull
    private static String proccess(Integer age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age can not be negative");
        }
        if (age > 18) {
            return "Adult";
        } else {
            return "Child";
        }
    }
}
