package ru.aston.java.base.lesson7.concurrency.callablefuture.completablefuture.model;

public class UserService {

    public static User getUserDetails(String userId) {
        return new User(userId);
    }
}
