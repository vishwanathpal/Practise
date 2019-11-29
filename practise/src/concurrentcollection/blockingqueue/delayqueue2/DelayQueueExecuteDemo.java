package concurrentcollection.blockingqueue.delayqueue2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

public class DelayQueueExecuteDemo {

	public static void main(String[] args) {

		final BlockingQueue<DelayElement> queue = new DelayQueue<DelayElement>();

		DelayQueueProducer delayQueueProducer = new DelayQueueProducer(queue);
		new Thread(delayQueueProducer).start();

		DelayQueueConsumer delayQueueConsumer1 = new DelayQueueConsumer(queue);
		new Thread(delayQueueConsumer1).start();

		DelayQueueConsumer delayQueueConsumer2 = new DelayQueueConsumer(queue);
		new Thread(delayQueueConsumer2).start();
	}
}
