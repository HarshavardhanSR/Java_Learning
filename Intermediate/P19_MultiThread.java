// Class 1 implementing Runnable interface
class ThreadOne implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Print which thread is executing
            System.out.println("Thread One is running, Iteration: " + i);
            try {
                Thread.sleep(1000); // Simulate some work by sleeping for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Class 2 implementing Runnable interface
class ThreadTwo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Print which thread is executing
            System.out.println("Thread Two is running, Iteration: " + i);
            try {
                Thread.sleep(1000); // Simulate some work by sleeping for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class P19_MultiThread{
    public static void main(String[] args) {
        // Create instances of both Runnable implementations
        Runnable threadOneRunnable = new ThreadOne();
        Runnable threadTwoRunnable = new ThreadTwo();

        // Create Thread objects and pass the Runnable implementations to them
        Thread thread1 = new Thread(threadOneRunnable);
        Thread thread2 = new Thread(threadTwoRunnable);

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
