package collectionframework.arraylist.userdefineobject;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {

		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee("vish", "pal"));
		emps.add(new Employee("Tez", "Tio"));
		emps.add(new Employee("Loran", "Odge"));

		System.out.println(emps.toString());

		Employee e = emps.get(1);
		e.setLastName("new");

		System.out.println(emps);
	}
}