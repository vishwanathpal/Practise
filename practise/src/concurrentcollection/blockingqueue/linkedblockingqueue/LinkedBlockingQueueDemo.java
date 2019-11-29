package concurrentcollection.blockingqueue.linkedblockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueDemo {

	public static void main(String[] args) {

		BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
		new Thread(new ProducerLBQ(queue)).start();
		new Thread(new ConsumerLBQ(queue)).start();
	}
}
