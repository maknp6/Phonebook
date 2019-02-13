package phonebook;

import phonebook.Address;
import phonebook.Person;

public class MyPhonebook 
{
	private Person[] personArray;
	
	
	// default constructor
	public MyPhonebook() 
	{// Class(aaray)NameOfArray =new Class [size]/[or number of records]
		Person[] newPersonArray = new Person[1];	//new person array
		Person newPerson = new Person();			// newPerson is the object -- new Person(); is the constructor 
		newPersonArray[0] = newPerson;				//the object created is assigned to newPersonArray
		this.personArray =newPersonArray;			
	}
	
	// Parameterized Constructor
	public MyPhonebook(Person[]personArray)
	{
		this.personArray = personArray;		
	}
		
	//  getters & setters	
	public Person[] getPersonArray() {
		return personArray;
	}
	public void setPersonArray(Person[] personArray) {
		this.personArray = personArray;
	}
	
//******************************************************************************
		
	public Person[] addFirstPerson (Person[] newPersonArray,Person person)  
	{
		Person tempP = new Person(); 			//object  
		newPersonArray[0] = tempP;
		
		newPersonArray[0].setFirstName(person.getFirstName() );
		newPersonArray[0].setLastName(person.getLastName() );
		newPersonArray[0].setPhoneNumber(person.getPhoneNumber() );
		String streetAddress = person.getAddress().getStreetAddress() ;
		String city = person.getAddress().getCity() ;
		String state = person.getAddress().getState() ;
		String zipCode = person.getAddress().getZipCode() ;
		
		Address address = new Address(streetAddress, city, state, zipCode);
		newPersonArray[0].setAddress(address);
		
		return newPersonArray;
	}
	
//******************************************************************************		
	
	public Person[] addPerson(Person[]personArray, Person person)
	{
		Person[] newPersonArray = new Person[personArray.length+1];
		
		for (int i =0; i<newPersonArray.length; i++) 
		{
			Person newPerson = new Person();
			newPersonArray[i] = newPerson;			
		}
		
		//----------------------------------------------------------------
		//copying the old array into the new array
		for (int i=0; i <personArray.length; i++) 
		{
			newPersonArray[i].setFirstName(personArray[i].getFirstName() );
			newPersonArray[i].setLastName(personArray[i].getLastName() );
			String streetAddress = personArray[i].getAddress().getStreetAddress();
			String city = personArray[i].getAddress().getCity();
			String state =personArray[i].getAddress().getState();
			String zipCode = personArray[i].getAddress().getZipCode();
			newPersonArray[i].setPhoneNumber(personArray[i].getPhoneNumber() );
			
			Address newAddress = new Address(streetAddress, city, state, zipCode);
			newPersonArray[i].setAddress(newAddress);		
		}		
		//---------------------------------------------------------------
		//adding a new person to the newPerson array
		newPersonArray[personArray.length].setFirstName(person.getFirstName() );
		newPersonArray[personArray.length].setLastName(person.getLastName() );	
		newPersonArray[personArray.length].setPhoneNumber(person.getPhoneNumber() );
		String streetAddress = person.getAddress().getStreetAddress();
		String city = person.getAddress().getCity();
		String state =person.getAddress().getState();
		String zipCode = person.getAddress().getZipCode();
		
		Address address = new Address(streetAddress, city, state, zipCode);
		newPersonArray[personArray.length].setAddress(address);		
		return newPersonArray;
	}

//******************************************************************************
	
	public void searchByFirstName(Person[] newPersonArray, String firstName) 
	{
		boolean searchRecord = false;
		
		for( int i = 0; i < newPersonArray.length; i++) 
		{
			if(firstName.equals(newPersonArray[i].getFirstName())) 
			{
				System.out.print(newPersonArray[i] + "\n\n");
				searchRecord = true;
			}			
		}
		if(!searchRecord) 
		{
			System.out.println("No Match Found");
		}
	}
	
//******************************************************************************
	
	public void searchByLastName(Person[] newPersonArray, String lastName) 
	{
		boolean searchRecord = false;
		
		for( int i = 0; i < newPersonArray.length; i++) 
		{
			if(lastName.equals(newPersonArray[i].getLastName())) 
			{
				System.out.print(newPersonArray[i] + "\n\n");
				searchRecord = true;
			}			
		}
		if(!searchRecord) 
		{
			System.out.println("No Match Found");
		}
	}
	
//******************************************************************************
	
		public void searchByFullName(Person[] newPersonArray, String fullName) 
		{
			boolean searchRecord = false;
			
			for( int i = 0; i < newPersonArray.length; i++) 
			{
				if(fullName.equals((newPersonArray[i].getFirstName())+ " " +(newPersonArray[i].getLastName())))
				{
					System.out.print(newPersonArray[i] + "\n\n");
					searchRecord = true;
				}			
			}
			if(!searchRecord) 
			{
				System.out.println("No Match Found");
			}
		}
		
//******************************************************************************
		
		public void searchByPhoneNumber(Person[] newPersonArray, String phoneNumber) 
		{
			boolean searchRecord = false;
				
			for( int i = 0; i < newPersonArray.length; i++) 
			{
				if(phoneNumber.equals(newPersonArray[i].getPhoneNumber()))
				{
					System.out.print(newPersonArray[i] + "\n\n");
					searchRecord = true;
				}			
			}
				if(!searchRecord) 
				{
					System.out.println("No Match Found");
				}
		}

//******************************************************************************
		
		public void searchByCity(Person[] newPersonArray, String city) 
		{
			boolean searchRecord = false;
						
			for( int i = 0; i < newPersonArray.length; i++) 
			{
				if(newPersonArray[i].getAddress().getCity().equals(city))
				{
					System.out.print(newPersonArray[i] + "\n\n");
					searchRecord = true;
				}			
			}
				if(!searchRecord) 
				{
					System.out.println("No Match Found");
				}
		}
	
//******************************************************************************
		
		public void searchByState(Person[] newPersonArray, String state) 
		{
			boolean searchRecord = false;
						
			for( int i = 0; i < newPersonArray.length; i++) 
			{
				if(newPersonArray[i].getAddress().getState().equals(state))
				{
					System.out.print(newPersonArray[i] + "\n\n");
					searchRecord = true;
				}			
			}
				if(!searchRecord) 
				{
					System.out.println("No Match Found");
				}
		}		
	
//******************************************************************************
		
		public void searchByZipCode(Person[] newPersonArray, String zipCode) 
		{
			boolean searchRecord = false;
						
			for( int i = 0; i < newPersonArray.length; i++) 
			{
				if(zipCode.equals(newPersonArray[i].getAddress().getZipCode()))
				{
					System.out.print(newPersonArray[i] + "\n\n");
					searchRecord = true;
				}			
			}
				if(!searchRecord) 
				{
					System.out.println("No Match Found");
				}
		}				
		
//******************************************************************************	

		public void showAllContacts(Person[] newPersonArray) 
		{
			for(int i = 0; i < newPersonArray.length; i++) 
			{
				System.out.print(newPersonArray[i] + "\n\n");				
			}
			System.out.println();
		}
	
//******************************************************************************

			public Person[] updateContact(Person[] newPersonArray, String phoneNumber, Person personForUpdating) 
			{			
			Person[] updatedPersonArray = new Person[newPersonArray.length];			
			boolean foundRecord = false;			
			for(int i = 0; i < updatedPersonArray.length; i++) 
			{				
				Person person = new Person();				
				updatedPersonArray[i] = person;				
			}
			
			for(int i = 0; i < newPersonArray.length; i++) 
			{				
				if(phoneNumber.equals(newPersonArray[i].getPhoneNumber())) 
				{					
					updatedPersonArray[i].setFirstName(personForUpdating.getFirstName());					
					updatedPersonArray[i].setLastName(personForUpdating.getLastName());
					updatedPersonArray[i].setPhoneNumber(personForUpdating.getPhoneNumber()); 
					String streetAddress = personForUpdating.getAddress().getStreetAddress();
					String city = personForUpdating.getAddress().getCity();
					String state = personForUpdating.getAddress().getState();
					String zipCode = personForUpdating.getAddress().getZipCode();					
					Address address = new Address(streetAddress, city, state, zipCode);					
					updatedPersonArray[i].setAddress(address);									
					
					foundRecord = true;					
				} 
				else 
				{					
					updatedPersonArray[i].setFirstName(newPersonArray[i].getFirstName());					
					updatedPersonArray[i].setLastName(newPersonArray[i].getLastName());
					updatedPersonArray[i].setPhoneNumber(newPersonArray[i].getPhoneNumber());
					String streetAddress = newPersonArray[i].getAddress().getStreetAddress();
					String city = newPersonArray[i].getAddress().getCity();
					String state = newPersonArray[i].getAddress().getState();
					String zipCode = newPersonArray[i].getAddress().getZipCode();					
					Address address = new Address(streetAddress, city, state, zipCode);					
					updatedPersonArray[i].setAddress(address);															
				}				
			}			
			if(foundRecord) 
			{				
				System.out.println("The new record for " + phoneNumber + " has been saved.\n");			
			} 
			else 
			{				
				System.out.println("No Match Found.\n");				
			}			
			return updatedPersonArray;			
		}			
			
//******************************************************************************	
			public static Person[] deleteContact(int temp, Person[] newPersonArray) 
			{
				//set length of new array to old array length minus 1.
				Person[] updated = new Person[newPersonArray.length-1];
				for (int i=0; i < newPersonArray.length-1; i++) 
				{	//temp is the array element to be removed.
					if (i >= temp)  
					{	//sets the array elements after one to be deleted down by one place.
						updated[i] = newPersonArray[i+1];
					} 
					else if (i < temp) 
					{	//copies in current array elements until we get to the one being deleted
						updated[i] = newPersonArray[i];
					}
				}
				return updated;
			}
			
}
