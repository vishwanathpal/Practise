	package collectionframework.set.treeset.comparable2;

import java.util.TreeSet;

public class ComparatorEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee("Nag", 100);
		Employee e2 = new Employee("Baliya", 200);
		Employee e3 = new Employee("Chiru", 50);
		Employee e4 = new Employee("Venki", 50);
		Employee e5 = new Employee("Nag", 100);
		
		TreeSet ts = new TreeSet();
		ts.add(e1);
		ts.add(e2); //e2.compareTo(e1);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		System.out.println("sort by ID "+ts);
		
		TreeSet ts1 = new TreeSet(new MyComparatorEmp());
		ts1.add(e1);
		ts1.add(e2); //e2.compareTo(e1);
		ts1.add(e3);
		ts1.add(e4);
		ts1.add(e5);
		System.out.println("sort by name "+ts1);
	}
}
