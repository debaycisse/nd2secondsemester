package week10;


public class StringStartEnd 
{
	public static void main(String[] args) 
	{
		String strings[] = {"started", "starting", "ended", "ending"};
		
		// test method startsWith
		for(String string : strings)  // this statement copies each element of strings array into string variable with type string at each iteration.
		{
			if(string.startsWith("st"))
				System.out.println(string + " starts with \"st\".");
		}  // end of for loop
		
		System.out.println();
		
		// test method startsWith starting from position 2 of string
		for(String string : strings)
		{
			if(string.startsWith("art", 2))
				System.out.println(string + " starts with \"art\" from position 2 onward.");
		}  // end of for loop
		
	}	// end of main method
}  // end of class - StringStartEnd
