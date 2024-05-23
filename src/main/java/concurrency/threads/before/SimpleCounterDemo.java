package ru.aston.java.base.lesson7.concurrency.threads.before;

public class SimpleCounterDemo {
    public static void main(String[] args) {
        SimpleCounterWorker scw1 = new SimpleCounterWorker("A");
        SimpleCounterWorker scw2 = new SimpleCounterWorker("B");

        scw1.runCounter(15);
        scw2.runCounter(15);
    }
}
