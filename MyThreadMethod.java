package EducationDecode;
public class MyThreadMethod extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is running........");
        for(int i=0;i<=5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThreadMethod t3=new MyThreadMethod();
        t3.start();
        t3.join();
        System.out.println("welcome to mojammil");

    }
}
