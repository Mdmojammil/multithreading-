package EducationDecode.synchronization.RannableCallable;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main1 {
    public static void main(String[] args) throws ExecutionException,InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(2);

        Callable<Integer>callable1=()->{
            System.out.println("task 1");
            return  1;
        };

        Callable<Integer>callable2=()->{
            System.out.println("task 2");
            return 2;
        };
        Callable<Integer>callable3=()->{
            System.out.println("task 3");
            return 3;

        };


        List<Callable<Integer>>list= Arrays.asList(callable1,callable2,callable3);

        List<Future<Integer>> futures = executorService.invokeAll(list);

        executorService.shutdown();
    }
}
