package EducationDecode;


public class MyThreads1 extends Thread {
    public MyThreads1(String name) {
        super(name);

    }

    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {

            StringBuilder s1=new StringBuilder();
            for (int j = 0; j < 100000000; j++) {
                s1.append("a");
            }
            System.out.println(Thread.currentThread().getName() + "-Priority:" + Thread.currentThread().getPriority() + "-count:" + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
        }
    }
        public static void main (String[]args) throws InterruptedException  {
            MyThreads1 l = new MyThreads1("low priority threads");
            MyThreads1 m = new MyThreads1("medium priority threads");
            MyThreads1 h = new MyThreads1("height priority threads");
            l.setPriority(Thread.MIN_PRIORITY);
            m.setPriority(Thread.NORM_PRIORITY);
            h.setPriority(Thread.MAX_PRIORITY);
            l.start();
            m.start();
            h.start();
        }
    }


