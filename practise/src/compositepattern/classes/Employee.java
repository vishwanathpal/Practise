package compositepattern.classes;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private String dept;
	private int salary;
	private ArrayList<Employee> subordinate;
	
	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinate = new ArrayList<Employee>();
	}
	
	public void add(Employee e) {
		subordinate.add(e);
	}
	
	public void remove(Employee e) {
		subordinate.remove(e);
	}
	
	public List<Employee> getSubordinate(){
		return subordinate;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + ", subordinate=" + subordinate
				+ "]";
	}
}
