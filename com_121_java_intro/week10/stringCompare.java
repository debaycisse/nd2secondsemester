package week10;
//String methods equals, equalsIgnoreCase, compareTo and regionMatches.

public class stringCompare 
{
	public static void main(String[] args) 
	{
		String s1 = new String( "hello" ); // s1 is a copy of "hello"
		String s2 = "goodbye";
		String s3 = "Happy Birthday";
		String s4 = "happy birthday";
		
		System.out.println("s1 = " + s1 + "\ns2 = " + s2 +
				"\ns3 = " + s3 + "\ns4 = " + s4);
		
		// test for equality
		if(s1.equals("hello"))
			System.out.println("\ns1 equals \"hello\"");
		else
			System.out.println("\ns1 does not equal as \"hello\"");
		
		// test with equality with ==
		if(s1 == "hello")
			System.out.println("\ns1 is the same object as \"hello\"");
		else
			System.out.println("\ns1 is not the same object as \"hello\"");
		
		// test for equality (ignore case)
		if(s3.equalsIgnoreCase(s4))
			System.out.println("\ns3:- " + s3 + " equals s4:- " + s4 + " with case ignored");
		else
			System.out.println("s3:- " + s3 + " does not equal s4:- " + s4);
		
		// test compareTo
		System.out.println("\ns1.compareTo(s2) is : " + 
		s1.compareTo(s2));
		System.out.println("\ns2.compareTo(s1) is : " + 
		s2.compareTo(s1));
		System.out.println("\ns1.compareTo(s1) is : " + 
		s1.compareTo(s1));
		System.out.println("\ns3.compareTo(s4) is : " + 
		s3.compareTo(s4));
		System.out.println("\ns4.compareTo(s3) is : " + 
		s4.compareTo(s3));
		
		// test regionMatches (case sensitive)
		if(s3.regionMatches(0, s4, 0, 5))  // 1st argmt = index of starting point for the invokee ; 2nd argmt = string to compare; 3rd argmt = index of starting point for the string to compare; 4th argmt = the number of characters to compare bwt the two strings
			System.out.println("First 5 characters of s3 and s4 match");
		else
			System.out.println(
					"First 5 characters of s3 and s4 do not match");
		
		// test regionMatches (ignore case)
		if(s3.regionMatches(true, 0, s4, 0, 5))  // When the first argument is true, the method ignores the case of the characters (i.e non-case sensitive) being compared. The remaining arguments are identical to those described above on line 47 for the four-argument regionMatches method
			System.out.println("First 5 characters of s3 and s4 match");
		else
			System.out.println("First 5 characters of s3 and s4 do not match");
	}  // end of main method

}  // end of class - sringCompare