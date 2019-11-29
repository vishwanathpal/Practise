package collectionframework.set.hashset;

import java.util.HashSet;

public class HashSetOverView {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("Z");
		hs.add(null);
		hs.add("10");
		System.out.println(hs.add("Z"));
		System.out.println(hs);
	}
}
