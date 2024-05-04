package com.mariosky;

//CustomerName class because i feel like it should be like this, instead of cluttered in CustomerAccount class
public class CustomerName {
	private String firstName;
	private String middleName;
	private String lastName;
	
	public CustomerName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public CustomerName(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		if(null==middleName || middleName.isEmpty())
			return "Customer: "+firstName + " " + lastName;;
		return "Customer: "+firstName + " "+ middleName + " " + lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
