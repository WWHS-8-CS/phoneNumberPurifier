import java.util.*;
import java.util.regex.*;
public class StringManipulation {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		Pattern namePattern = Pattern.compile("[a-zA-Z]+\\s+[a-zA-Z]+");
		System.out.print("Name: ");
		Matcher nameMatcher = namePattern.matcher(s.nextLine());

		Pattern phoneNumPattern = Pattern.compile("[0-9]");
		System.out.print("Phone Number: ");
		Matcher phoneNumMatcher = phoneNumPattern.matcher(s.nextLine());
		
		nameMatcher.find();
		char [] name = nameMatcher.group().toCharArray();
		
		for(char c : name)
			System.out.print(c);
		System.out.println();

		for(int i = 0; i <= 10; i++){
			phoneNumMatcher.find();
			if (!phoneNumMatcher.hitEnd()){
				System.out.print(phoneNumMatcher.group());
				if (i == 2 || i == 5)
					System.out.print('-');
			}
		}
	}
}