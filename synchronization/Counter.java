package EducationDecode.synchronization;

public class  Counter {
    private int count=0;

    public synchronized  void increment() {// critical section/race condition
            count++;
    }
    public int getCount(){
        return count;
    }
}
