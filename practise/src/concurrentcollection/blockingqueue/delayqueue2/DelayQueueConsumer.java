package concurrentcollection.blockingqueue.delayqueue2;

import java.util.concurrent.BlockingQueue;

public class DelayQueueConsumer implements Runnable {

	protected BlockingQueue<DelayElement> blockingQueue;

	public DelayQueueConsumer(BlockingQueue<DelayElement> queue) {
		this.blockingQueue = queue;
	}

	@Override
	public void run() {

		while (true) {
			try {
				// use poll() method to see the difference between the methods
				DelayElement delayElement = blockingQueue.take();
				System.out.println(Thread.currentThread().getName() + " Consummer take() " + delayElement);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
