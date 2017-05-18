//Programmer: Justin Doggett
//Date: 4/25/2017
//Description: This program displays the contents of my First, Middle, and Last name as well as the contents
//             of the initials of my first, middle, and last name.


public class NameInitials
{
	public static void main(String [] args)
	{
		//First, middle, and last name variable declarations
		String firstName = "Justin"; //storing the value Justin in the firstName variable
		String middleName = "Robert"; //storing the value Robert in the middleName variable
		String lastName = "Doggett";  //storing the value Doggett in the lastName variable

		//first name, middle name, and last name initials variable declarations
		char firstInitial = 'J'; //storing the value J in the firstInitial variable
		char middleInitial = 'R'; //storing the value R in the middleInitial variable
		char lastInitial = 'D'; //storing the value D in the lastInitial variable

		//Display first name, middle name, and last name to the console
		System.out.println(firstName);
		System.out.println(middleName);
		System.out.println(lastName);

		//Display first name initial, middle name initial, and last name initial to the console
		System.out.println(firstInitial);
		System.out.println(middleInitial);
		System.out.println(lastInitial);
	}
}
