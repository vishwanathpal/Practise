package concurrentcollection.blockingqueue.delayqueue2;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;

public class DelayQueueProducer implements Runnable {

	int count = 0;
	boolean flag = true;

	protected BlockingQueue<DelayElement> blockingQueue;
	final Random random = new Random();

	public DelayQueueProducer(BlockingQueue<DelayElement> queue) {
		this.blockingQueue = queue;
	}

	@Override
	public void run() {

		while (flag) {

			// producer will produce 16 item only, if removed then it will be go on.
			if (count == 15)
				flag = false;

			try {
				int delay = random.nextInt(10000);
				DelayElement delayElement = new DelayElement(UUID.randomUUID().toString(), delay);
				System.out.println("Producer Put: " + delayElement);
				blockingQueue.put(delayElement);
				Thread.sleep(500);
				count++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}