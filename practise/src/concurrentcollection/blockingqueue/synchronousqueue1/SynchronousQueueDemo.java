package concurrentcollection.blockingqueue.synchronousqueue1;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo {

	public static void main(String[] args) {

		BlockingQueue<String> queue = new SynchronousQueue<String>();
		
		Thread producer = new Thread("PRODUCER") {
			public void run() {
			
				String event = "FOUR";
				try {
					queue.put(event);
					System.out.println("published event : "+Thread.currentThread().getName()+" "+event );
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		producer.start();
		
		Thread consummer = new Thread("CONSUMMER") {
			
			@Override
			public void run() {
				
				try {
					String event = queue.take();
					//Thread.sleep(5000);
					System.out.println("consummed event : "+Thread.currentThread().getName()+" "+event );
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		consummer.start();
	}
}																																	
