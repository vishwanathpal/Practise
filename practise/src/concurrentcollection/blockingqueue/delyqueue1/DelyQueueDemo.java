package concurrentcollection.blockingqueue.delyqueue1;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

public class DelyQueueDemo {

	public static void main(String[] args) {
		 
		BlockingQueue<DelayWorker> queue = new DelayQueue<DelayWorker>();
		try {
			queue.put(new DelayWorker(1000, "this is the 1st worker.."));
			queue.put(new DelayWorker(10000, "this is the 2nd worker.."));
			queue.put(new DelayWorker(4000, "this is the 3rd worker.."));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		while(!queue.isEmpty()) {
			try {
				System.out.println(queue.take()+" time: ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}