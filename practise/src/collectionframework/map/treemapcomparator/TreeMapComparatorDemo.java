package collectionframework.map.treemapcomparator;

import java.util.TreeMap;

public class TreeMapComparatorDemo {

	public static void main(String[] args) {

		TreeMap tm = new TreeMap(new TreeMapMyComparator());
		tm.put("XXX", "10");
		tm.put("AAA", "20");
		tm.put("ZZZ", "30");
		tm.put("LLL", "40");
		System.out.println(tm);
	}
}
