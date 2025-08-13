package net.springrest.demo;

import lombok.Data;

//@Data
public class Employee {

	private int id;
	private String firstname;
	private String lastname;
	public Employee(int id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
}
