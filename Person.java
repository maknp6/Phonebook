package phonebook;

import phonebook.Person;

public class Person 
{
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private Address address =new Address();
	
	
	
	public Person() 
	{	//  Default Constructor
		this.firstName = "";
		this.lastName = "";
		this.phoneNumber = "";
		Address address = new Address();
		this.address = address;
	}
	
	
	public Person(String firstName, String lastName, String phoneNumber, Address address) 
	{	//  Parameterized Constructor
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	//  Generate Getters & Setters
	
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	/*
	 * @Override public int compareTo(Person otherPerson) {
	 * if(this.getLastName().charAt(0) > otherPerson.getLastName().charAt(0)) {
	 * return 1; } else if (this.getLastName().charAt(0) ==
	 * otherPerson.getLastName().charAt(0)) { if(this.getLastName().charAt(1) >
	 * otherPerson.getLastName().charAt(1)) { return 1; } else if
	 * (this.getLastName().charAt(1) == otherPerson.getLastName().charAt(1)) {
	 * if(this.getLastName().charAt(2) > otherPerson.getLastName().charAt(2)) {
	 * return 1; } else if(this.getLastName().charAt(2) ==
	 * otherPerson.getLastName().charAt(2)) { return 0; } else { return - 1; } }
	 * else { return -1; } } else { return -1 ; } }
	 */
	

	
	
	@Override
	public String toString() 
	{
		return firstName + " " +lastName +", "+ phoneNumber
				+ ", " + address;
	}
	
	
}
