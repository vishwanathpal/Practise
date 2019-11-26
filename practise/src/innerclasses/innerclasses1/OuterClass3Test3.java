package innerclasses.innerclasses1;

public class OuterClass3Test3 {

	public static void main(String[] args) {

		OuterClass3Test oc3t = new OuterClass3Test();
		OuterClass3Test.InnerClass3 oi = oc3t.new InnerClass3();
		oi.m3();
	}
}
