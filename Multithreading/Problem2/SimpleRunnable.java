package Problem2;

class SimpleRunnable implements Runnable {
    private String threadName;

    // Constructor to set the thread's name
    public SimpleRunnable(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        try {
            // Print a message before sleep
            System.out.println(threadName + " is starting.");

            // Pause the thread for 3 seconds (3000 milliseconds)
            Thread.sleep(3000);

            // Print a message after sleep
            System.out.println(threadName + " has finished after sleeping.");
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
        }
    }
}