package multithreadings.yieldjoinsleepmethods.sleep;

public class MyThreadSleepExecution {

	public static void main(String[] args) {

		MyThreadSleep t = new MyThreadSleep();
		t.start();
		t.interrupt();
		
		System.out.println("End of main");
	}
}