package singletonpattern;

public class DbSingletonDemo {

	public static void main(String[] args) {
		
		DbSingleton instance1 = DbSingleton.getInstance();
		System.out.println(instance1);
		
		DbSingleton instance2 = DbSingleton.getInstance();
		System.out.println(instance2);
	}
}
