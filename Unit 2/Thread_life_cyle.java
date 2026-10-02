class MyThread extends Thread {

    public void run() {
        System.out.println("Thread is running");

        try {
            System.out.println("Thread is going to sleep...");
            Thread.sleep(2000);

            System.out.println("Thread woke up");
        }
        catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("Thread has completed");
    }
}

public class Thread_life_cycle {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();

        System.out.println("Thread created");
        System.out.println("State: " + t.getState());
        t.start();
        System.out.println("Thread started");
        System.out.println("State: " + t.getState());
        t.join();
        System.out.println("Thread has finished");
        System.out.println("State: " + t.getState());
    }
}
