package EducationDecode.synchronization.InterThredComunication;

class SharedResource {
    private int data;
    private boolean hasData = false;

    // Producer method to produce data
    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();  // Wait if data already exists (i.e., the consumer hasn't consumed it yet)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        // Produce data
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify();  // Notify the consumer that data is available
    }

    // Consumer method to consume data
    public synchronized int consume() {
        while (!hasData) {
            try {
                wait();  // Wait if no data is available (i.e., the producer hasn't produced it yet)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        // Consume the data
        int consumedData = data;
        hasData = false;
        System.out.println("Consumed: " + consumedData);
        notify();  // Notify the producer that space is available for new data
        return consumedData;
    }
}

class Producer implements Runnable {
    private final SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {  // Producer produces 10 items
            resource.produce(i);
            try {
                Thread.sleep(100);  // Simulate some delay in production
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer implements Runnable {
    private final SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {  // Consumer consumes 10 items
            resource.consume();
            try {
                Thread.sleep(150);  // Simulate some delay in consumption
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Create and start the producer and consumer threads
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}
