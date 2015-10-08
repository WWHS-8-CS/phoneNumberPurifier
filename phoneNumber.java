import java.util.*;
public class phoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a phone number: ");
		String rawNumber = scan.nextLine();
		System.out.println(rawNumber);
		//boolean edit = true;
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
		
		if(newNumber.length() != 9)
		{
			System.out.println("This is no phone number!!!");
			System.exit(0);
		}
			
		System.out.println("Finished number: " + newNumber);
		
		int intNumber = Integer.parseInt(newNumber);	//Finished phone number	
		
	}

}
