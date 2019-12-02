package concurrentcollection.blockingqueue.synchronousqueue3;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class SynchronousQueProducer extends Thread{
	
	private BlockingQueue<Integer> queue;

	public SynchronousQueProducer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {

		while(true) {
			try {
				queue.put(producer());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private Integer producer() {
		Random ranNumber = new Random();
		Integer number = ranNumber.nextInt(1000);
		
		try {
			Thread.sleep(ranNumber.nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println("Producer: " + number);
		return number;
	}
}