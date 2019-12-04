package concurrentcollection.concurrentlinkedqueue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentLinkedQueueTest {
	
	public static void main(String arg[]) {
		
		Buffer buffer = new Buffer();
		ExecutorService excutor = Executors.newFixedThreadPool(3);
		//starting thread producer 
		excutor.execute(new ProdTask(buffer));
		//starting thread consumer
		excutor.execute(new ConTask(buffer));
		excutor.execute(new ConTask(buffer));
		excutor.execute(new ConTask(buffer));
		excutor.shutdown();
	}
}

/*
 * Buffer buffer = new Buffer(); new Thread(new ProdTask(buffer)).start(); new
 * Thread(new ConTask(buffer)).start(); new Thread(new ConTask(buffer)).start();
 * new Thread(new ConTask(buffer)).start();
 */