package collectionframework.arraylist.userdefineobject3.implementedclass;

import collectionframework.arraylist.userdefineobject3.interfaces.RoleInterface;

public class EmployeeRole implements RoleInterface {
	
	private String role;

	public EmployeeRole(String role) {
		this.role = role;
	}


	@Override
	public void getTotalEmployees(String role) {
		System.out.println("the role is "+ role);
		
	}

	public String getRole() {
		return role;
	}


	@Override
	public void getEmployeesCount() {
		// TODO Auto-generated method stub
		
	}

}
