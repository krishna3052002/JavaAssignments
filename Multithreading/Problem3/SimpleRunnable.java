package Problem3;

class SimpleRunnable implements Runnable {
    @Override
    public void run() {
        // Print the name of the current thread
        System.out.println("The current thread is: " + Thread.currentThread().getName());
    }
}
