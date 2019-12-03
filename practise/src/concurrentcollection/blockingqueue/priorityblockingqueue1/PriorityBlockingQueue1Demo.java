package concurrentcollection.blockingqueue.priorityblockingqueue1;

import java.time.LocalDate;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue1Demo {

	public static void main(String[] args) {

		BlockingQueue<EmployPriorty> queue = new PriorityBlockingQueue<EmployPriorty>();
		queue.add(new EmployPriorty(4, "vish", LocalDate.now()));
		queue.add(new EmployPriorty(2, "monj", LocalDate.now()));
		queue.add(new EmployPriorty(5, "anjs", LocalDate.now()));
		queue.add(new EmployPriorty(1, "Rahu", LocalDate.now()));
		queue.add(new EmployPriorty(6, "Ryan", LocalDate.now()));
		
		while(true) {
			EmployPriorty e;
			try {
				e = queue.take();
				System.out.println(e);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}
}
