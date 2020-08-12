package week10;
// This app demonstrates the length, 
// charAt and getChars methods of the string class.

public class stringMiscellaneous 
{
	public static void main(String[] args) 
	{
		String s1 = "hello there";
		char charArray[] = new char[5];
		
		System.out.println("s1: " + s1);
		
		// test length method
		System.out.println("\nLength of s1 is " + s1.length());
		
		// loop through charcters in s1 with charAt and display in reversed form
		System.out.println("\nThe string reversed form is");
		
		for(int count = s1.length() - 1; count > 0; count--)
			System.out.println(s1.charAt(count));
		
		// copy characters from string in to charArray
		s1.getChars(0, 5, charArray, 0);
		System.out.println("\nThe character array's values are now");
		
		for(char character : charArray)
			System.out.println(character);
		

	}  // end of main method

}  // end of class - stringMiscellaneous
