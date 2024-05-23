package ru.aston.java.base.lesson7.concurrency.synchronization.troubles.model;

public class SyncThread implements Runnable {
    private final Object lock1;
    private final Object lock2;

    public SyncThread(Object o1, Object o2) {
        this.lock1 = o1;
        this.lock2 = o2;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("Thread: " + name + " try acquiring lock on " + lock1);
        synchronized (lock1) {
            System.out.println(name + " already acquired lock on " + lock1);
            work();
            System.out.println(name + " try acquiring lock on " + lock2);
            synchronized (lock2) {
                System.out.println(name + " already acquired lock on " + lock2);
                work();
            }
            System.out.println(name + " released lock on " + lock2);
        }
        System.out.println(name + " released lock on " + lock1);
        System.out.println(name + " finished execution.");
    }

    private void work() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
