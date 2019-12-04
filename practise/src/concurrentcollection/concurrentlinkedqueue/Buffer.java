package concurrentcollection.concurrentlinkedqueue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

//Shared class used by threads
public class Buffer {

	int i;
	Queue<Integer> que = new ConcurrentLinkedQueue<Integer>();
	
	//for consumer thread
	public void get(){
        System.out.println("Consumer recd - " +Thread.currentThread().getName()+": "+ que.poll());
    }
	
	//for producer thread
	public void put(int i) {
		this.i = i;
		que.add(i);
		System.out.println("Producer recd - " + i);
	}
}
