package practise;

public class BreakWithBlock {
	
	public static void main(String[] args) {
		
		one: for(int i=0; i<3; i++) {
			System.out.println("value of i= "+i);
		}
	for(int j=0; j<100; j++) {
		if(j==10) break;
	}
	}

}
