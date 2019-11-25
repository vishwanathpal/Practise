package collectionframework.arraylist.userdefineobject2;

import collectionframework.arraylist.userdefineobject2.classes.EmployeeContext;
import collectionframework.arraylist.userdefineobject2.implementedclasses.Role;

public class UserDefineObject2Test {

	public static void main(String[] args) {

		EmployeeContext empcnt = new EmployeeContext();
		empcnt.setEmployeeContext(new Role());
		empcnt.getEmployee("admin");
	}
}
