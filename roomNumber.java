import java.util.Scanner; //Import utilities needed for scanner
public class roomNumber { //Define the class
	public static void main(String[] args) { //Begin main
		Scanner scan = new Scanner(System.in); //Starts a scanner that will handle input
		
		System.out.print("Please enter a room number: "); //Prompts user for input
		String rawNumber = scan.nextLine(); //Saves raw number as string to be broken down later
		System.out.print("Please enter a Name: "); //Prompts user for input
		String name = scan.next(); //Saves input as a string (their name)
		String temp = ""; //Define temporary string to be used later
		String newNumber = ""; //Define string for the purified number
		
		for(int i = 0; i < rawNumber.length(); i++) //For each digit in the raw phone number
		{
			temp = rawNumber.substring(i, i+1); //sets the temp string to be a single digit
			if(!temp.equalsIgnoreCase(" ") && !temp.equalsIgnoreCase("*") && !temp.equalsIgnoreCase(".") && !temp.equalsIgnoreCase("(") && !temp.equalsIgnoreCase(")") && !temp.equalsIgnoreCase("-"))
			{
				newNumber = newNumber + temp; //If the digit is a number, add it to the purified number string
			}
		}
		
		if(newNumber.length() != 5) //Make sure the room number is the correct length
		{
			System.out.println("This is no room!!!"); //If it is not a room number, tell the user and exit the program
			System.exit(0);
		}
		
		System.out.println("Name: " + name + " and Room: " + newNumber.substring(0,1) + "-" + newNumber.substring(1,newNumber.length())); //Output the cleansed contact to the user
		
		
	}

}
