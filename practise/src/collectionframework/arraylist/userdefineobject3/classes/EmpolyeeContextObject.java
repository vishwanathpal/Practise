package collectionframework.arraylist.userdefineobject3.classes;

import java.util.*;

import collectionframework.arraylist.userdefineobject3.implementedclass.AdminRole;
import collectionframework.arraylist.userdefineobject3.interfaces.RoleInterface;

public class EmpolyeeContextObject {
	
	List<Employee> employees;
	
	RoleInterface roleInterface = new AdminRole();
	
	//AdminRole roles = new AdminRole(null);
	
	public EmpolyeeContextObject(){
		this.employees=new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee employee){
		this.employees.add(employee);
	}
	
	public int totalEmployee(){
		int total = 0;
		for(Employee employee : employees){
			total += employee.getId();
		}
		return total;
	}
	
	public void countEmployee(RoleInterface roleInterface){
		int total = totalEmployee();
		
	}
	public void allEmployee(RoleInterface roleInterface){
		roleInterface.getTotalEmployees(AdminRole.class.get);
		
	}

}
