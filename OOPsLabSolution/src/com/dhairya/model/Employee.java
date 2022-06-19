package com.dhairya.model;

public class Employee {
	
	private String firstName;
	private String lastName;
	
	public Employee() {
		firstName = "DHAIRYA";
		lastName = "RASTOGI";
	}
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName.toLowerCase();
		this.lastName = lastName.toLowerCase();
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
	
	

}
