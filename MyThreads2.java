package EducationDecode;

public class MyThreads2 extends Thread{

    @Override
    public void run() {
        try{
            Thread.sleep(1000);
            System.out.println("Threads is Running....");
        }catch (InterruptedException e){
            System.out.println("threads interrupted"+e);
        }
    }

    public static void main(String[] args) {
        MyThreads2 t1=new MyThreads2();
        t1.start();
        t1.interrupt();

    }
}
