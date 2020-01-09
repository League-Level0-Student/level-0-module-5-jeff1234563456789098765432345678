package _03_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
			String a = JOptionPane.showInputDialog("Whats your name You name must be 6 letters");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
			System.out.println(a.toUpperCase());

		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.
			a.length();
		
			// 4. Create a String variable to store the next character of the name
			//    using .substring(start, end)
			//    HINT: replace 'start' and 'end' to get String with character at i 
		String b = null;
			b.substring(0,6);
					
			//    and lower case for ODD characters.
			int i = 0;
			boolean a1=(i%2==1);{
				 
				  }
			
			// 6. ADD this String  (containing 1 char) to the goofyName String
		
		// 7. Use pop-up to show user their Goofy name

	}
}

