package phonebook;

public class Address 
{
	private String  streetAddress;
	private String city;
	private String state;
	private String zipCode;

	public Address() 
	{
	}
	public Address(String streetAddress, String city, String state, String zipCode) 
	{
		
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}	
	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}	
	public String getZipCode() {
		return this.zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return  streetAddress + ", "+ city + ", "+ state +", "+  zipCode;
	}
}
//end
