package EducationDecode.synchronization.ScheduleExecutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main2 {
    public static void main(String[] args)throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> future1 = executorService.submit(new DependentServic());
        Future<String> future2 = executorService.submit(new DependentServic());
        Future<String> future3 = executorService.submit(new DependentServic());

        future1.get();
        future2.get();
        future3.get();

        System.out.println("All dependent services. finish. starting main service ");
        executorService.shutdown();
    }
}
class DependentServic implements Callable<String>{
    @Override
    public String call() throws Exception{
        System.out.println(Thread.currentThread().getName()+"service started");
        Thread.sleep(2000);
        return "ok";
    }
}
