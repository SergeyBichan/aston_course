package lesson_7.forkjoin;



import lesson_7.forkjoin.model.DivideNumberAction;

import java.util.concurrent.ForkJoinPool;

public class DivideNumberDemo {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        DivideNumberAction divideNumberAction = new DivideNumberAction(1000);
        forkJoinPool.invoke(divideNumberAction);
    }
}
