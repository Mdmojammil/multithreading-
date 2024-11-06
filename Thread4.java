package EducationDecode;

public class Thread4 extends Thread{

    @Override
    public void run() {
        while (true){
            System.out.println("hello words");
        }
    }

    public static void main(String[] args) {
        Thread4 thread4=new Thread4();
        thread4.setDaemon(true);
        Thread4 t1=new Thread4();
        t1.start();
        System.out.println("Main done");
    }
}
