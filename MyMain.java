package phonebook;

import java.util.Scanner;

import phonebook.Person;
import phonebook.MyPhonebook;


public class MyMain 
{
	public static void main(String[] args) 
	{
		Scanner scanner1 = new Scanner(System.in);
		
		int menuOption;
		MyPhonebook phonebook = new MyPhonebook();
		Person[] newPersonArray = new Person[1];
		
		do 
		{
			System.out.println("Please Select an Option from the following Menu: ");
			System.out.println(" 1.  Add a New Contact");
			System.out.println(" 2.  Search by First Name");
			System.out.println(" 3.  Search by Last Name");
			System.out.println(" 4.  Search by Full Name");
			System.out.println(" 5.  Search by Phone Number");
			System.out.println(" 6.  Search by City");
			System.out.println(" 7.  Search by State");
			System.out.println(" 8.  Search by Zip Code");
			System.out.println(" 9.  Show all Contacts");
			System.out.println("10.  Udate a Contact");
			System.out.println("11.  Delete a Contact");
			System.out.println("12.  Exit");	
			
			menuOption = scanner1.nextInt();
			System.out.println();
			scanner1.nextLine();
			
			
			String updatePhoneNumber;
			//String updateNumber;
			String currentNumber;
						switch(menuOption) 
			{			
				case 1: 
					Person p = new Person();
            		
            		System.out.println("Enter the person's First Name:");
            		String firstName = scanner1.nextLine();
            		p.setFirstName(firstName);
            		
            		System.out.println("Enter the person's Last Name:");
            		String lastName = scanner1.nextLine();
            		p.setLastName(lastName);
            		
            		System.out.println("Enter the new Phone Number");
            		String phoneNumber = scanner1.nextLine();
            		p.setPhoneNumber(phoneNumber);
            		
            		System.out.println("Enter the new Contact's Street Address");
            		String streetAddress = scanner1.nextLine();
            		p.getAddress().setStreetAddress(streetAddress);

            		System.out.println("Enter the new Contact's City");
            		String city = scanner1.nextLine();
            		p.getAddress().setCity(city);
            		
            		System.out.println("Enter the new Contact's State");
            		String state = scanner1.nextLine();
            		p.getAddress().setState(state);
            		
            		System.out.println("Enter the new Contact's Zip Code");
            		String zipCode = scanner1.nextLine();
            		p.getAddress().setZipCode(zipCode);
            		
            		if(newPersonArray[0] == null)          		
            			phonebook.addFirstPerson(newPersonArray, p);
            		else
            			newPersonArray = phonebook.addPerson(newPersonArray, p);
            		System.out.println(p);
            		System.out.println("\nPerson Added!!!");
            		break;
			
			
            	//*************************************************************            		
				case 2:  
					System.out.println("Enter the Persons First Name:\n");
                    firstName = scanner1.nextLine();                	
                	System.out.println();                	
                	phonebook.searchByFirstName(newPersonArray, firstName);
                	break;					
			
				case 3:  
					System.out.println("Enter the Persons Last Name:\n");
                    lastName = scanner1.nextLine();                	
                	System.out.println();                	
                	phonebook.searchByLastName(newPersonArray, lastName);
                	break;
					
			
				case 4:  
					System.out.println("Enter the Persons First & Last Name:\n");
                    String fullName = scanner1.nextLine();
                    System.out.println();                	
                	phonebook.searchByFullName(newPersonArray, fullName);
                	break;
					
			
				case 5:  
					System.out.println("Enter the Number of the Person you are Searching for:\n");
					phoneNumber = scanner1.nextLine();
					System.out.println();                	
					phonebook.searchByPhoneNumber(newPersonArray, phoneNumber);
					break;
			
					
				case 6:  //search by city
					System.out.println("Enter a City to Search:\n");
                    city = scanner1.nextLine();                	
                	System.out.println();                	
                	phonebook.searchByCity(newPersonArray, city);
                	break;
						
                	
				case 7:  
					//search by state
					System.out.println("Enter a State to Search:\n");
                    state = scanner1.nextLine();                	
                	System.out.println();                	
                	phonebook.searchByState(newPersonArray, state);
					break;
			
					
				case 8:  	
					//search by zip code
					System.out.println("Enter a Zip Code to Search:\n");
                    zipCode = scanner1.nextLine();                	
                	System.out.println();                	
                	phonebook.searchByZipCode(newPersonArray, zipCode);
					break;
			
					
				case 9:  	//show all contacts					              	
                	phonebook.showAllContacts(newPersonArray);
                	break;                	
			
                	
				case 10:  	//update a contact				
					System.out.println(" Enter a phone number to be updated: ");					
					System.out.println();				
					currentNumber = scanner1.nextLine();
					
					for (int i=0; i<newPersonArray.length; i++) 
					{
						if(newPersonArray[i].getPhoneNumber().equals(currentNumber)) 
						{
							System.out.println(newPersonArray[i]);
							System.out.println("Is this the contact you would like to update (yes/no)? ");
							String yesNo = scanner1.nextLine();
							yesNo = yesNo.toLowerCase();
							if (yesNo.contentEquals("yes") || yesNo.contentEquals("y"))  
							{
								System.out.println("Enter the new number: "); 
								updatePhoneNumber = (scanner1.nextLine());
								newPersonArray[i].setPhoneNumber(updatePhoneNumber);
								System.out.println("The contact has been updated to the following: ");
								System.out.println(newPersonArray[i]);								 
								break;
							}
						} 
						else 
						{
							if (i==newPersonArray.length-1) 
							{
								System.out.println("No one with that number");
							}
						}
					}
					break;                   
			//******************************************************************
					
				case 11:  	//delete a contact				
					System.out.println("Enter the Phone Number to delete a contact");
					currentNumber = scanner1.nextLine();
					if (newPersonArray.length <1) 
					{
						System.out.println("No Match Found");
					}
					for (int i=0; i<newPersonArray.length; i++) 
					{
						if(newPersonArray[i].getPhoneNumber().equals(currentNumber)) 
						{
							System.out.println("Delete this Contact? (yes/no) ");
							System.out.println(newPersonArray[i]);					
							
							String yesNo = scanner1.nextLine();
							yesNo = yesNo.toLowerCase();
							int temp = i;  
							if (yesNo.contentEquals("yes") || yesNo.contentEquals("y"))  
							{	
								newPersonArray = MyPhonebook.deleteContact(temp, newPersonArray);								
								System.out.println("Deleted Successfully ");
								break;
							}
						}
						else 
						{
							if (i==newPersonArray.length-1) {
								System.out.println("No Match Found");
							}
						}
					}					
					break;
					
				case 12:  	//exit 
					System.out.println("Phonebook has been closed");
					break;
				default:
					System.err.println("Invalid Entry");
					break;			
			}   
		} 	
		while(menuOption != 12); 
			scanner1.close();	
	}
}