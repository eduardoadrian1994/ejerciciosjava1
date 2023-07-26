package jemplos;

public class StarvationExample {
	public static void main(String[] args) {
        Runnable task = () -> {
            synchronized (StarvationExample.class) {
                System.out.println("Thread started: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread finished: " + Thread.currentThread().getName());
            }
        };

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }
    }
}
