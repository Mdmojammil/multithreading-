package EducationDecode.synchronization.ThreadSafe;

public class LambdaExpression {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        Thread t1=new Thread(runnable);
        t1.start();
    }

}
