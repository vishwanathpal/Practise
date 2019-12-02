package concurrentcollection.blockingqueue.synchronousqueue2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo2 {

	public static void main(String[] args) {

		final BlockingQueue<String> synchroQue = new SynchronousQueue<String>();
		
		SynchronousQueueProducer queProd = new SynchronousQueueProducer(synchroQue);
		new Thread(queProd).start();
		
		SynchronousQueueConsummer queConsum = new SynchronousQueueConsummer(synchroQue);
		new Thread(queConsum).start();
	}
}
