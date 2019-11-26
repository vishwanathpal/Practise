package innerclasses.innerclasses1;

public class OuterClass4Test4 {
	
	int x = 10;
	
	class InnerClass4{
		
		int x = 100;
		
		public void m4() {
			
			int x = 1000;
			//accessing inner class local veriable.
			System.out.println(x);
			//accessing inner class GLOBAL veriable.
			System.out.println(this.x);
			//accessing outer class GLOBAL veriable.
			System.out.println(OuterClass4Test4.this.x);
		}
	}

	public static void main(String[] args) {

		new OuterClass4Test4().new InnerClass4().m4();
	}
}
