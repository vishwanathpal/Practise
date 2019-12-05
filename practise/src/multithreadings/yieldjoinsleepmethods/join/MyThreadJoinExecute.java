package multithreadings.yieldjoinsleepmethods.join;

public class MyThreadJoinExecute {

	public static void main(String[] args) throws InterruptedException {

		MyThreadJoin t = new MyThreadJoin();
		t.start();
		t.join(100);
		
		for (int i = 0; i <= 30; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}