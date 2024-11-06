package EducationDecode.synchronization.ThreadSafe;

public class LambdaExpression2 {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            for(int i=0; i<10;i++){
                System.out.println("hello words");
            }
        });
        t1.start();
//        int a=1;
//        Runnable task=()->{
//            for (int i=0;i<10;i++){
//                System.out.println("Hello world");
//
//            }
//        };
    }
}
