package collectionframework.map.hashtable;

public class HashTableWorkNHashMethodOver {
	
	int i;

	public HashTableWorkNHashMethodOver(int i) {
		this.i = i;
	}
	
	@Override
	public int hashCode() {
		return i;
	}
	
	@Override
	public String toString() {
		return i+"";
	}
}
