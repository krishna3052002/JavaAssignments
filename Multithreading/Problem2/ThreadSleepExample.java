package Problem2;
public class ThreadSleepExample {
    public static void main(String[] args) {
        // Create and start multiple threads
        Thread thread1 = new Thread(new SimpleRunnable("Thread 1"));
        Thread thread2 = new Thread(new SimpleRunnable("Thread 2"));
        Thread thread3 = new Thread(new SimpleRunnable("Thread 3"));

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}