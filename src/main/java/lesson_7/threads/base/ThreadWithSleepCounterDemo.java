package lesson_7.threads.base;

import ru.aston.java.base.lesson7.concurrency.threads.base.worker.ThreadWithSleepCounterWorker;

public class ThreadWithSleepCounterDemo {
    public static void main(String[] args) {
        ThreadWithSleepCounterWorker tcw1 = new ThreadWithSleepCounterWorker("A", 15);
        ThreadWithSleepCounterWorker tcw2 = new ThreadWithSleepCounterWorker("B", 15);


        // МНОГОПОТОЧНАЯ ОБРАБОТКА
        tcw1.start();
        tcw2.start();
    }
}
