package EducationDecode;

import java.awt.*;

public class Test1 {
    public static void main(String[] args) {
        words1 words1=new words1();
        Thread t1=new Thread(words1);
        t1.start();

        for (; ;){
            System.out.println(Thread.currentThread().getName());
        }

    }
}
