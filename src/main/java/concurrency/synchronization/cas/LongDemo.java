package concurrency.synchronization.cas;

public class LongDemo {
    private static Long longCounter = 0L;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                incrementLong();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                incrementLong();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("LongCounter: " + longCounter);
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Time elapsed: " + duration);
    }

    private synchronized static void incrementLong() {
        longCounter++;
    }
}
