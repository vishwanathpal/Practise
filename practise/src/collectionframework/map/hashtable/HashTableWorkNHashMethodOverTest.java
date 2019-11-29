package collectionframework.map.hashtable;

import java.util.Hashtable;

public class HashTableWorkNHashMethodOverTest {
	
	public static void main(String[] args) {
		
		Hashtable<HashTableWorkNHashMethodOver, String> ht = new Hashtable<HashTableWorkNHashMethodOver, String>();
		ht.put(new HashTableWorkNHashMethodOver(5), "A");
		ht.put(new HashTableWorkNHashMethodOver(2), "B");
		ht.put(new HashTableWorkNHashMethodOver(6), "C");
		ht.put(new HashTableWorkNHashMethodOver(15), "D");
		ht.put(new HashTableWorkNHashMethodOver(23), "E");
		ht.put(new HashTableWorkNHashMethodOver(16), "F");
		//ht.put(null, "dhu"); // NPE both key and value should not be null
		
		System.out.println(ht);
	}
}
//{6=c, 16=F, 5=A, 15=D, 2=B, 23=E}
//Hashtable going to create 11 bucket and fill the element based on the hashing technique. The order would be:
//From top to bottom and if multiple element in a single bucket then order would be right to left.
// if we change hashCode method of 'HashTableWorkNHashMethodOver' class as i%9 then the output would also change.
//if you change the initial capacity of the Hashtable object then output would be change for sure.
