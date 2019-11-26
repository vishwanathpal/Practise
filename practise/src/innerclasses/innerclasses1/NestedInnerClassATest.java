package innerclasses.innerclasses1;

public class NestedInnerClassATest {

	public static void main(String[] args) {

		NestedInnerClassA a = new NestedInnerClassA();
		NestedInnerClassA.B b = a.new B();
		NestedInnerClassA.B.C c = b.new C();
		c.m1();
	}
}
