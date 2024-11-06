package EducationDecode.synchronization.CountDownLatch;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfService=3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfService);

        CountDownLatch latch=new CountDownLatch(numberOfService);
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));

        latch.await();
        System.out.println("main");
        executorService.shutdown();

    }
}