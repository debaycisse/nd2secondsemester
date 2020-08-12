package week10;


public class strinConstruct 
{
	public static void main(String[] args) 
	{
		char charArray[] = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
		String s = new String("hello");  // string constructor with string parameter
		
		// Using String constructors
		String s1 = new String();
		String s2 = new String(s);
		String s3 = new String(charArray);
		String s4 = new String(charArray, 6, 3);
		// 6 - indicates the character at the position 6   // 3 - indicates the nunmber or length of characters to be taken or copied.
		System.out.println("S1 is " + s1 + 
				"\nS2 is " + s2 + "\nS3 is " + s3 + 
				"\nS4 is " + s4);  // display the string values
						

	}  // end of main method

}  // end of class - strinConstruct
