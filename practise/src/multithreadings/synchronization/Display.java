package multithreadings.synchronization;

public class Display {
	
	public synchronized void wish(String name) throws Exception {
		
		for(int i=0; i<10; i++) {
			System.out.println("good morning:");
			Thread.sleep(1000);
			System.out.println(name);
		}
	}
}

// remove synchronized to observe non-synchronized method behavior.