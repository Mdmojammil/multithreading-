package EducationDecode.synchronization.DadeLock;

public class DeadlockExample {

    static class Pen {
    }

    static class Paper {
    }

    private static final Pen pen = new Pen();
    private static final Paper paper = new Paper();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (pen) {
                System.out.println("Thread 1: Holding pen...");

                // Simulate some work with pen
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 1: Waiting for paper...");
                synchronized (paper) {
                    System.out.println("Thread 1: Acquired paper!");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (paper) {
                System.out.println("Thread 2: Holding paper...");

                // Simulate some work with paper
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 2: Waiting for pen...");
                synchronized (pen) {
                    System.out.println("Thread 2: Acquired pen!");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
