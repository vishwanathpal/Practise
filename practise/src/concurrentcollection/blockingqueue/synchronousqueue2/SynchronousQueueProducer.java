package concurrentcollection.blockingqueue.synchronousqueue2;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;

public class SynchronousQueueProducer implements Runnable {
	
	protected BlockingQueue<String> queue;
	final Random random = new Random();
	
	public SynchronousQueueProducer(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {

		while(true) {
			
			try {
				String number = UUID.randomUUID().toString();
				//Thread.sleep(1000);
				queue.put(number);
				System.out.println("Producer Put: "+number);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
