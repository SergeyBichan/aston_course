package ru.aston.java.base.lesson7.concurrency.threads.deamon;

import ru.aston.java.base.lesson7.concurrency.threads.deamon.worker.ThreadCounterWithDaemonFlagWorker;

public class ThreadCounterWithDaemonFlagDemo {
    public static void main(String[] args) {
        ThreadCounterWithDaemonFlagWorker tcw1 = new ThreadCounterWithDaemonFlagWorker("A", 1000, true);
        ThreadCounterWithDaemonFlagWorker tcw2 = new ThreadCounterWithDaemonFlagWorker("B", 100, false);


        // МНОГОПОТОЧНАЯ ОБРАБОТКА
        tcw1.start();
        tcw2.start();

        System.out.println("Process is finished!!!");
    }
}
