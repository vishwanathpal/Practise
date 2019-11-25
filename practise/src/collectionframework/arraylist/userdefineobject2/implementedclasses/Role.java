package collectionframework.arraylist.userdefineobject2.implementedclasses;

import collectionframework.arraylist.userdefineobject2.interfaces.EmployeeInterfec;

public class Role implements EmployeeInterfec {
	
	private String role;
	
	//public Role(String role) {
	//	this.role = role;
	//}

	@Override
	public void FetchAllDetailsOfEmployees(String role) {
		
		if(role.equals("admin"))
			System.out.println("You have entered "+role+" role");
		else if (role.equals("employee")) 
			System.out.println("You have entered "+role+" role");
		else	
			System.out.println(role+" role does not exist");
	}
}
