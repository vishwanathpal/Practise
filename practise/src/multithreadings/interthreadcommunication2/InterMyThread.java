package multithreadings.interthreadcommunication2;

public class InterMyThread extends Thread{
	
int total = 0;
	
	@Override
	public void run() {
		
		synchronized (this) {
			System.out.println("child thread start calculation");
			for(int i=0; i<=100; i++) {
				total += i;
			}
			System.out.println("child thread trying to give notification");
			this.notify();
		}
	}
}