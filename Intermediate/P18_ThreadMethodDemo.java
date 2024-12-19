
class MyThread extends Thread {

    @Override
    public void run() {
        try {
            // Print thread details using methods
            System.out.println(getName() + " has started execution.");
            System.out.println("Thread Priority: " + getPriority());
            System.out.println("Is thread alive? " + isAlive());

            // Simulating thread work by sleeping
            Thread.sleep(1000);
            System.out.println(getName() + " is doing work...");

            Thread.sleep(1000);
            System.out.println(getName() + " has finished work.");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}

public class P18_ThreadMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        // Create three threads
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        // Set custom thread names
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY);  // Priority 5 (default)
        t3.setPriority(Thread.MAX_PRIORITY);   // Priority 10

        // Set thread-3 as a daemon thread
        t3.setDaemon(true);

        // Start the threads
        t1.start();
        t2.start();
        t3.start();

        // Use join() to wait for the threads to finish
        t1.join();
        t2.join();
        t3.join();

        // Check if threads are alive after they finish execution
        System.out.println("Is " + t1.getName() + " alive? " + t1.isAlive());
        System.out.println("Is " + t2.getName() + " alive? " + t2.isAlive());
        System.out.println("Is " + t3.getName() + " alive? " + t3.isAlive());

        // Demonstrating the usage of thread name and priority
        System.out.println("Final state:");
        System.out.println(t1.getName() + " has priority " + t1.getPriority());
        System.out.println(t2.getName() + " has priority " + t2.getPriority());
        System.out.println(t3.getName() + " has priority " + t3.getPriority());
        System.out.println("Is " + t3.getName() + " a daemon thread? " + t3.isDaemon());

        // Attempting deprecated methods (avoid using them in production code)
        // The following lines are commented to prevent using deprecated methods.
        // t1.stop();   // Deprecated
        // t2.suspend(); // Deprecated
        // t2.resume();  // Deprecated
    }
}

