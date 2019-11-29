package concurrentcollection.blockingqueue.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerServiceDemo {

	public static void main(String[] args) {

		BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(10);
		
		Producer producer = new Producer(queue);
		Consummer consummer = new Consummer(queue);
		
		new Thread(producer).start();
		new Thread(consummer).start();
        System.out.println("Producer and Consumer has been started");
	}
}
