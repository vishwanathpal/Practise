package concurrentcollection.concurrentnavigablemap;

import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentNavigableMapDemo {

	public static void main(String[] args) {

		ConcurrentNavigableMap cnm = new ConcurrentSkipListMap();
		
		cnm.put(1, "Sunday");
		 
        cnm.put(2, "Monday");
 
        cnm.put(3, "Tuesday");
 
        cnm.put(4, "Wednesday");
 
        cnm.put(5, "Thursday");
 
        cnm.put(6, "Friday");
 
        cnm.put(7, "Saturday");
        
        System.out.println("1. descendingKeySet(): "+ cnm.descendingKeySet());
        System.out.println("2. descendingMap(): "+ cnm.descendingMap());
        System.out.println("3. headMap(K toKey): "+cnm.headMap(3));
        System.out.println("4. headMap(K toKey, boolean inclusive): "+cnm.headMap(3, true));
        System.out.println("5. keySet(): "+cnm.keySet());
        System.out.println("6. navigableKeySet(): "+cnm.navigableKeySet());
        System.out.println("7. subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive): "+cnm.subMap(3, false, 6, false));
        System.out.println("8. subMap(K fromKey, K toKey): "+cnm.subMap(3, 6));
        System.out.println("9. tailMap(K fromKey): " +cnm.tailMap(5));
        System.out.println("10. tailMap(K fromKey, boolean inclusive): "+cnm.tailMap(5, true));
	}
}
