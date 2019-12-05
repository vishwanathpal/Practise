package multithreadings.yieldjoinsleepmethods.yeild;

public class MyThread extends Thread{
	
	@Override
	public void run() {

		for(int i=0; i<30; i++) {
			System.out.println("child thread yield");
			Thread.yield();
		}
	}
}
