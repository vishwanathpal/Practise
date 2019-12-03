package concurrentcollection.blockingqueue.priorityblockingqueue1;

import java.time.LocalDate;

public class EmployPriorty implements Comparable<EmployPriorty> {
	
	private Integer id;
	private String name;
	private LocalDate dob;

	public EmployPriorty(int id, String name, LocalDate dob) {
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	
	@Override
	public int compareTo(EmployPriorty emp) {
		
		return this.getId().compareTo(emp.getId());

		/*
		 * if(this.id < ep.getId()) return -1; else if (this.id > ((EmployPriorty)
		 * ep).getId()) return +1; return 0;
		 */
		//return 0;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDob() {
		return dob;
	}

	@Override
	public String toString() {
		return "EmployPriorty [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	
	

}
