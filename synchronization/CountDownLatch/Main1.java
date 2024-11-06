

package EducationDecode.synchronization.CountDownLatch;

import java.util.concurrent.*;

public class Main1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfService=3;

        CountDownLatch latch=new CountDownLatch(numberOfService);
        for(int i=0;i<numberOfService;i++){
            new Thread(new DependentService(latch)).start();

        }
        latch.await(5,TimeUnit.SECONDS);
        System.out.println("Main");
    }

}
class DependentService implements Runnable{

    private final CountDownLatch latch;

    public  DependentService(CountDownLatch latch){
        this.latch=latch;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(6000);
            System.out.println(Thread.currentThread().getName()+"service started");

        }catch (Exception e) {
        }finally {
            latch.countDown();
        }
    }
}





