package com.sourceit.java.basic.lesovaya.ht13;

public class Employee {

	private String firstName;
	private String lastName;
	
	public Employee(String fName, String lName){
		this.firstName = fName;
		this.lastName = lName;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
	
}
