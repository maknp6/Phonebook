package phonebook;

import java.util.Scanner;
import java.util.ArrayList;

public class PhonebookArrayList
{


private static Scanner input;

	public static void main(String[] args) 
	{
		input = new Scanner(System.in);
		int choice =0;
		ArrayList<Person> people = new ArrayList<Person>();



		do 
		{	
			System.out.println();
			int newChoice = displayMenu();
			choice = newChoice;
			System.out.println("Selected: " + choice);
			switch(choice) 
			{
				case 1: 
					Person p = new Person();
					input.nextLine();

					System.out.println("Enter First Name:");
					p.setFirstName(input.nextLine());

					System.out.println("Enter Last Name:");
					p.setLastName(input.nextLine());

					System.out.println("Enter Telephone Number:");
					p.setPhoneNumber(input.nextLine());

					System.out.println("Enter Street");
					p.getAddress().setStreetAddress(input.nextLine());

					System.out.println("Enter City");
					p.getAddress().setCity(input.nextLine());
            
					System.out.println("Enter State");
					p.getAddress().setState(input.nextLine());

					System.out.println("Enter Zip Code");
					p.getAddress().setZipCode(input.nextLine());
        
					people.add(p);
					System.out.println("Successfully ADDED " + p);
					break;
					
					
					
				case 2:
					System.out.println("to delete a record: ");
					break;
	
				
					
				case 3:
					System.out.println("to update a record");
					break;
				
				
					
				case 4:
					System.out.println("Listing all records");
					for (Person person : people) 
					{
						System.out.println(person);
					}
					break;
		
					
					
				case 5:
					input.nextLine();
					System.out.println("Enter Full Name to Search for: ");
					String name = input.nextLine();
					for (Person person : people) 
					{
						if(person.getFirstName().equals(name)) 
						{
							System.out.println(person); 
						}
					}
					break;
		
					
					
				case 6: 
					input.nextLine();
					System.out.println("Enter First Name to Search for: ");
					String fname = input.nextLine();
					for (Person person : people) 
					{
						if(person.getFirstName().equals(fname)) 
						{
							System.out.println(person); 
						}
					}
					break;
		
					
					
				case 7:
					input.nextLine();
					System.out.println("Enter Last Name to Search for: ");
					String lname = input.nextLine();
					for (Person person : people) 
					{
						if(person.getLastName().equals(lname)) 
						{
							System.out.println(person); 
						}
					}
					break;

					
					
				case 8:
					input.nextLine();
					System.out.println("Enter Telephone to Search for: ");
					String phone = input.nextLine();
					for (Person person : people) 
					{
						if(person.getPhoneNumber().equals(phone)) 
						{
							System.out.println(person); 
						}
					}
					break;
		
					
					
				case 9:
					input.nextLine();
					System.out.println("Enter City to Search for: ");
					String city = input.nextLine();
					for (Person person : people) 
					{
						if(person.getAddress().getCity().equals(city)) 
						{
							System.out.println(person); 
						}
					}
					break;
		
					
					
				case 10:
					input.nextLine();
					System.out.println("Enter State to Search for: ");
					String state = input.nextLine();
					for (Person person : people) 
					{
						if(person.getAddress().getState().equals(state)) 
						{
							System.out.println(person); 
						}
					}
					break;
		
					
					
				case 11:
					System.out.println("Bye");
					break;
		
			}
			
		} 	while (choice != 11);
		
	}

public static int displayMenu() 
{
input = new Scanner(System.in);

System.out.println("What would you like to do: ");
System.out.println("1. Add a record");
System.out.println("2. Delete a record");
System.out.println("3. Update a record");
System.out.println("4. List all records");
System.out.println("5. Search by First Name");
System.out.println("6. Search by First Name");
System.out.println("7. Search by Last Name");
System.out.println("8. Search by Telephone Number");
System.out.println("9. Search by City");
System.out.println("10.Search by State");
System.out.println("11.Exit");
System.out.println();

//Break this later
int choice = input.nextInt();
return choice;
}	
}
