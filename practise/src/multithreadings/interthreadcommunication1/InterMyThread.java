package multithreadings.interthreadcommunication1;

public class InterMyThread extends Thread{
	
	int total = 0;
	
	@Override
	public void run() {

		for(int i=0; i<=100; i++) {
			total += i;
		}
		this.notify();
	}
}
