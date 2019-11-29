package collectionframework.map.treemapcomparator;

import java.util.TreeMap;

public class TreeMapDefaultSorting {

	public static void main(String[] args) {

		TreeMap tm = new TreeMap();
		tm.put("105", "vishw");
		tm.put("108", "vish");
		tm.put("101", "vish");
		tm.put("104", "vishd");
		tm.put("104", "vishd"); //this won't add b/c key is duplicate but value can be duplicate
		tm.put("dfd", "vish");
		tm.put("aaaf", "vish");
		tm.put("aa2", "vish");
		//tm.put(null, "vish");	//NPE
		System.out.println(tm);
	}
}
