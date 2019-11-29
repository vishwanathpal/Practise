package collectionframework.set.treeset.comparator1;

import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>(new MyComparator());
		ts.add(10);
		ts.add(0);
		ts.add(15);
		ts.add(20);
		ts.add(20);
		ts.add(2);
		System.out.println(ts);
	}
}