package EducationDecode.synchronization.executerFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main1 {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        ExecutorService executer=Executors.newFixedThreadPool(3);
        for(int i=1;i<10;i++){
            int finalI = i;
            executer.submit(()->{
                        long result=factorial(finalI);
                        System.out.println(result);
                    });
        }
        executer.shutdown();
        try {
            while (!executer.awaitTermination(10, TimeUnit.MILLISECONDS)) {
                System.out.println("wating....");
            }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
        }
        System.out.println("Total time:"+(System.currentTimeMillis()-startTime));
    }
    private static long factorial(int n){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long result=1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return  result;
    }
}
