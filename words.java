package EducationDecode;

public class words extends Thread {

    @Override
    public void run() {
        super.run();
        for (; ;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
