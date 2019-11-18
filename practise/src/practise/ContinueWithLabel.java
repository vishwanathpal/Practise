package practise;

public class ContinueWithLabel {

	public static void main(String[] args) {

		outer: for (int i = 0; i < 10; i++) {

			//System.out.println("outer i ="+ i);
			for (int j = 0; j < 10; j++) {
				//System.out.println("outer j ="+ j);
				if (j > i) {
					System.out.println();
					continue outer;
				}
				System.out.println(" " + (i * j));
			}
		}
		System.out.println();
	}

}
