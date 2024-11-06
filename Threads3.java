package EducationDecode;

public class Threads3 extends Thread {
    public Threads3(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Threads3 t1 = new Threads3("t1");
        Threads3 t2 = new Threads3("t2");
        t1.start();
        t2.start();

    }
}