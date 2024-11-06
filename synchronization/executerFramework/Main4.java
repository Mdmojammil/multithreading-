package EducationDecode.synchronization.executerFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Create a single-threaded executor
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Create a Callable task to execute
        Callable<Void> task = () -> {// kuch return karna hai to callable // kuch return nahi karna hai to runnable
            System.out.println("Hello");
            return null; // Return null as the result type is Void
        };
        // Submit the task to the executor and get the future
        Future<Void> future = executorService.submit(task);
        // Wait for the task to complete and get the result
        future.get();
        // Shutdown the executor service
        executorService.shutdown();
    }
}
