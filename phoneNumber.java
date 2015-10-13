import java.util.*;
public class phoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		






		System.out.print("Please enter a Name: ");
		String name = scan.next();
		System.out.print("Please enter a phone number: ");
		String rawNumber = scan.nextLine();
		String temp = "";
		String newNumber = "";
		
		for(int i = 0; i < rawNumber.length(); i++)
		{
			temp = rawNumber.substring(i, i+1);
			if(!temp.equalsIgnoreCase(" ") && !temp.equalsIgnoreCase("*") && !temp.equalsIgnoreCase(".") && !temp.equalsIgnoreCase("(") && !temp.equalsIgnoreCase(")") && !temp.equalsIgnoreCase("-"))
			{
				newNumber = newNumber + temp;
			}
		}
		
		if(newNumber.length() != 10 || newNumber.length() != 7)
		{
			System.out.println("This is no phone number!!!");
			System.exit(0);
		}
		
		long finalNumber = Long.parseLong(newNumber);	//Finished phone number	
		System.out.println("Name: " + name + " and Number: " + finalNumber);
		
		
	}

}
