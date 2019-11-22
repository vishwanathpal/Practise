package compositepattern;

import compositepattern.classes.Employee;

public class CompositePatternDdemo {

	public static void main(String[] args) {
		
		Employee CEO = new Employee("Bastian", "BD", 1500);
		Employee headSales = new Employee("Ryan", "Marketing", 2000);
		Employee headMarketing = new Employee("Jose", "CTO", 4000);
		Employee clerlk1 = new Employee("Juri", "accounting", 1000);
		Employee clerlk2 = new Employee("Luri", "Back Office", 1200);
		Employee SalesEx1 = new Employee("vish", "Aria Sales", 1500);
		Employee SalesEx2 = new Employee("Alom", "State Sales", 1800);
		
		CEO.add(headSales);
		CEO.add(headMarketing);
		
		headSales.add(SalesEx1);
		headSales.add(SalesEx2);
		
		headMarketing.add(clerlk1);
		headMarketing.add(clerlk2);
		
		System.out.println("CEO::"+CEO);
		
		for(Employee headEmployee : CEO.getSubordinate()) {
			System.out.println("headEmployee::"+headEmployee);
			for(Employee employee : headEmployee.getSubordinate()) {
				System.out.println("Employee::"+employee);
			}
		}
	}
}
//reference: https://www.youtube.com/watch?v=VZ2HUkfIdWA