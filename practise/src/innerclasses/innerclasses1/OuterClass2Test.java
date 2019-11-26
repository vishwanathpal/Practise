package innerclasses.innerclasses1;

public class OuterClass2Test {
	
	class InnerClass2{
		public void m2(){

			System.out.println("Inner class method m2");
		}
	}
	
	public void outerMethod() {
		InnerClass2 ic2 = new InnerClass2();
		ic2.m2();
	}

	public static void main(String[] args) {

		OuterClass2Test oct2 = new OuterClass2Test();
		oct2.outerMethod();
	}
}

//accessing inner class method in instance area of the outer class.
