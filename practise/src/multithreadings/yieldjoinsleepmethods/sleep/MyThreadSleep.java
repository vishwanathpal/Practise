package multithreadings.yieldjoinsleepmethods.sleep;

public class MyThreadSleep extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("I lazy thread");

				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			// e.printStackTrace();
			System.out.println("I got interrupted");
		}
	}
}