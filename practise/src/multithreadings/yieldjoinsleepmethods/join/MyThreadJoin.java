package multithreadings.yieldjoinsleepmethods.join;

public class MyThreadJoin extends Thread{
	
	@Override
	public void run() {
	
		for(int i=0; i<30; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}