package innerclasses.innerclasses1;

public class OuterClass1Test {
	
	class InnerClass{
		public void m1() {
			System.out.println("This is inner classes");
		}
	}

	public static void main(String[] args) {

		OuterClass1Test outClass = new OuterClass1Test(); 
		OuterClass1Test.InnerClass i = outClass.new InnerClass();
		i.m1();
		
		//this combine all three line (13,14,15)
		//new InnerClass1Test().new InnerClass().m1();
	}
}
