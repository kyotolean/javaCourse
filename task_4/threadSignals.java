public class Main {
    public static void main(String[] args) {
        Object lock = new Object();
        Thread waitingThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Waiting for signal...");
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Received signal!");
            }
        });
        Thread signalingThread = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Signaling...");
                lock.notify();
            }
        });
        waitingThread.start();
        signalingThread.start();
    }
}