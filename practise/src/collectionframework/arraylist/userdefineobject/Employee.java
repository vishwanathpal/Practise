package collectionframework.arraylist.userdefineobject;

public class Employee {
	
	private String firstName;

	private String lastName;

	private Double salary;

	public Address address;
	
	public Employee(String firstName, String lastName, Address address) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.address = new Address(address);

	  }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [lastName=" + lastName + ", firstName=" + firstName + ", salary=" + salary + ", address="
				+ address + "]";
	}
}
