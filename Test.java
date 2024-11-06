package EducationDecode;

public class Test {
    public static void main(String[] args){
       // for(int i=0;i<10000;i++){

        words words=new words();// new
        words.start();//RUNNABLE

        for(; ;){
            System.out.println(Thread.currentThread().getName());
        }
        // System.out.println(Thread.currentThread().getName());
       // System.out.println(Thread.activeCount());
    }
}
