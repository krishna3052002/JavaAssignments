package Problem3;
public class ThreadNamingExample {
    public static void main(String[] args) {
        // Create Runnable instance
        SimpleRunnable runnable = new SimpleRunnable();

        // Create multiple threads with different names
        Thread thread1 = new Thread(runnable, "Thread-1");
        Thread thread2 = new Thread(runnable, "Thread-2");
        Thread thread3 = new Thread(runnable, "Thread-3");

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
