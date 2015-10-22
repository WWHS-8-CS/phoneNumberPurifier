import java.util.Scanner; //Import utilities needed for scanner
public class radioStation { //Define the class
	public static void main(String[] args) { //Begin main
		Scanner scan = new Scanner(System.in); //Starts a scanner that will handle input
		
		System.out.print("Please enter a station frequency: "); //Prompts user for input
		String rawNumber = scan.nextLine(); //Saves raw number as string to be broken down later
		System.out.print("Please enter a station name: "); //Prompts user for input
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
		
		if(newNumber.length() != 4) //Make sure the room number is the correct length
		{
			System.out.println("This is no frequency!!!"); //If it is not a correct number, tell the user and exit the program
			System.exit(0);
		}
		char[] station = new char[newNumber.length()];
		for(int i = 0; i < station.length; i++)
			station[i] = newNumber.charAt(i);			

		if(newNumber.substring(0,1).equals("0"))	
		System.out.println(name + " " + newNumber.substring(1,3) + "." + newNumber.substring(3,newNumber.length())); //Output the cleansed contact to the user
		else
		System.out.println(name + " " + newNumber.substring(0,3) + "." + newNumber.substring(3,newNumber.length())); //Output the cleansed contact to the user
	}

}
