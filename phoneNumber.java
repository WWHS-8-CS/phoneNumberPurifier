import java.util.*; //Import utilities needed for scanner
public class phoneNumber { //Define the class
	public static void main(String[] args) { //Begin main
		Scanner scan = new Scanner(System.in); //Starts a scanner that will handle input
		
		System.out.print("Please enter a phone number: "); //Prompts user for input
		String rawNumber = scan.nextLine(); //Saves raw phone number as string to be broken down later
		System.out.print("Please enter a Name: "); //Prompts user for input
		String name = scan.next(); //Saves input as a string (their name)
		String temp = ""; //Define temporary string to be used later
		String newNumber = ""; //Define string for the purified phone number
		
		for(int i = 0; i < rawNumber.length(); i++) //For each digit in the raw phone number
		{
			temp = rawNumber.substring(i, i+1); //sets the temp string to be a single digit
			if(!temp.equalsIgnoreCase(" ") && !temp.equalsIgnoreCase("*") && !temp.equalsIgnoreCase(".") && !temp.equalsIgnoreCase("(") && !temp.equalsIgnoreCase(")") && !temp.equalsIgnoreCase("-"))
			{
				newNumber = newNumber + temp; //If the digit is a number, add it to the purified number string
			}
		}
		
		if(newNumber.length() != 10 && newNumber.length() != 7) //Make sure the number is the correct length with/without the area code
		{
			System.out.println("This is no phone number!!!"); //If it is not a phone number, tell the user and exit the program
			System.exit(0);
		}
		
		long finalNumber = Long.parseLong(newNumber);	//Convert finished phone number	to a long (some wouldn't fit within an int with an area code)
		System.out.println("Name: " + name + " and Number: " + finalNumber); //Output the cleansed contact to the user
		
		
	}

}
