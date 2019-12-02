package concurrentcollection.blockingqueue.synchronousqueue2;

import java.util.concurrent.BlockingQueue;

public class SynchronousQueueConsummer implements Runnable {
	
	protected BlockingQueue<String> queue;
	
	public SynchronousQueueConsummer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {

		while(true) {
			
			try {
				Thread.sleep(5000);
				String number = queue.take();
				System.out.println(Thread.currentThread().getName()+"->take(): "+number);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}