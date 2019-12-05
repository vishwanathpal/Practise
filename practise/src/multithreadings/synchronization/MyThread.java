package multithreadings.synchronization;

public class MyThread extends Thread{
	
	Display d;
	String name;

	public MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run() {

		try {
			d.wish(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
