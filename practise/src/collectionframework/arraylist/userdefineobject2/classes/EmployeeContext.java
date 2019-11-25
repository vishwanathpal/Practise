package collectionframework.arraylist.userdefineobject2.classes;

import collectionframework.arraylist.userdefineobject2.interfaces.EmployeeInterfec;

public class EmployeeContext {
	
	EmployeeInterfec employeeInterfec;

	public void setEmployeeContext(EmployeeInterfec employeeInterfec) {
		this.employeeInterfec = employeeInterfec;
	}

	public void getEmployee(String role) {
		employeeInterfec.FetchAllDetailsOfEmployees(role);
	}
}
