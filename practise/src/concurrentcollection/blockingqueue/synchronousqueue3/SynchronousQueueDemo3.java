package concurrentcollection.blockingqueue.synchronousqueue3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo3 {
	
    static final int NUMBER_OF_CONSUMERS = 10;

	public static void main(String[] args) {

		BlockingQueue<Integer> syncQueue = new SynchronousQueue<>();
		 
		SynchronousQueProducer producer = new SynchronousQueProducer(syncQueue);
        producer.start();
 
        SynchronousQueConsummer[] consumers = new SynchronousQueConsummer[NUMBER_OF_CONSUMERS];
 
        for (int i = 0; i < NUMBER_OF_CONSUMERS; i++) {
            consumers[i] = new SynchronousQueConsummer(syncQueue);
            consumers[i].start();
        }
	}
}
