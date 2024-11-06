package EducationDecode.synchronization.executerFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       ExecutorService executorService= Executors.newSingleThreadExecutor();

       Future<?>future=executorService.submit(()-> System.out.println("Hello"));

        System.out.println(future.get());
        if (future.isDone()){
            System.out.println("Task is done");
        }
        executorService.shutdown();
    }

}
