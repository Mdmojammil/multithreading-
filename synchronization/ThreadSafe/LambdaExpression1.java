package EducationDecode.synchronization.ThreadSafe;

public class LambdaExpression1 {
    public static void main(String[] args) {
        Runnable task1=()->{
            System.out.println("Hello");
        };
        Thread t1=new Thread(task1);
        t1.start();
    }
}
