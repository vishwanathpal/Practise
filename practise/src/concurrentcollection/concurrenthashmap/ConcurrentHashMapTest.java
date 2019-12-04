package concurrentcollection.concurrenthashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

	public static void main(String[] args) {

		Map<Integer, String> map = new ConcurrentHashMap<Integer, String>();

		map.put(1, "vish");
		map.put(5, "paul");
		map.put(2, "dhir");
		map.put(4, "rahu");
		map.put(3, "ketu");

		System.out.println("without iteraraion \n" + map);

		Iterator<Integer> it = map.keySet().iterator();

		while (it.hasNext()) {
			Integer key = it.next();
			if (key == 3)
				map.put(key, "kama");
		}
		System.out.println("with iteraraion \n" + map);

		// =====with HashMap============
		map = new HashMap<Integer, String>();

		map.put(1, "vish");
		map.put(5, "paul");
		map.put(2, "dhir");
		map.put(4, "rahu");
		map.put(3, "ketu");

		System.out.println("HashMap without iteraraion \n" + map);

		Iterator<Integer> its = map.keySet().iterator();

		while (its.hasNext()) {
			Integer key = its.next();
			if (key == 3) {
				map.put(key*4, "kamalr");
				//break; //this will add a new entry to the map but modifying existing one will throw exception
			}
				
		}
		System.out.println("HashMap with iteraraion \n" + map);
	}
}