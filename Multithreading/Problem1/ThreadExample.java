package Problem1;
public class ThreadExample {
    public static void main(String[] args) {
        // Create an instance of SimpleRunnable
        SimpleRunnable runnable = new SimpleRunnable();
        
        // Create a Thread object with the SimpleRunnable instance
        Thread thread = new Thread(runnable);
        
        // Start the thread
        thread.start();
    }
}
