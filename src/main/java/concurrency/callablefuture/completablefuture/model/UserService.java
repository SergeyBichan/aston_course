package concurrency.callablefuture.completablefuture.model;

public class UserService {

    public static User getUserDetails(String userId) {
        return new User(userId);
    }
}
