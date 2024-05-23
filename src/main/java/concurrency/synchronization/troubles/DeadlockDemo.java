package ru.aston.java.base.lesson7.concurrency.synchronization.troubles;

import ru.aston.java.base.lesson7.concurrency.synchronization.troubles.model.SyncThread;

public class DeadlockDemo {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();

        Thread t1 = new Thread(new SyncThread(obj1, obj2), "t1");
        Thread t2 = new Thread(new SyncThread(obj2, obj1), "t2");

        t1.start();
        try {
            Thread.sleep(1000);
            t2.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
