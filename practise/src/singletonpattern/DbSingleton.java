package singletonpattern;

public class DbSingleton {
	
	//eager initialization 5 to 12
	//private static DbSingleton instance = new DbSingleton();
	
	//private DbSingleton() {}
	
	//public static DbSingleton getInstance() {
		//return instance;
	//}
	
	//lazy initialization 15 to 24
	private static volatile DbSingleton instance = null;
	
	private DbSingleton() {}
	
	public static DbSingleton getInstance() {
		if(instance == null) {
			instance = new DbSingleton();
		}
		return instance;
	}

}
