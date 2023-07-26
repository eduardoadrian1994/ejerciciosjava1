package jemplos;

public class RaceConditionExample {

	    public static void main(String[] args) throws InterruptedException {
	        Counter counter = new Counter();

	        Runnable incrementTask = () -> {
	            for (int i = 0; i < 1000; i++) {
	                counter.increment();
	            }
	        };

	        Thread thread1 = new Thread(incrementTask);
	        Thread thread2 = new Thread(incrementTask);

	        thread1.start();
	        thread2.start();

	        thread1.join();
	        thread2.join();

	        System.out.println("Count: " + counter.getCount());
	    }
	
}
