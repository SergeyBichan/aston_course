package ru.aston.java.base.lesson7.concurrency.threads.base;

import ru.aston.java.base.lesson7.concurrency.threads.base.worker.ThreadCounterWorker;

public class ThreadCounterDemo {
    public static void main(String[] args) {
        ThreadCounterWorker tcw1 = new ThreadCounterWorker("A", 15);
        ThreadCounterWorker tcw2 = new ThreadCounterWorker("B", 15);

        // МНОГОПОТОЧНАЯ ОБРАБОТКА
        tcw1.start();
        tcw2.start();
        System.out.println("Process is finished!!!");
    }
}
