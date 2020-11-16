/*
* AverageThreeIntegers
* Calculates the sumand average of any three integer numbers
*/
import javax.swing.JOptionPane;
public class Week4_Average
{
	public static void main( String args[] )
	{
		int firstNumber; // first integer number
		int secondNumber; // second integer number
		int thirdNumber; // third integer number

		int sum; // sum of the three numbers

		double average; // average of the three numbers

		String input; // input values
		String result; // output generating string


		// Accept integer numbers from the user
		input = JOptionPane.showInputDialog( null, "Enter first number: " );
		firstNumber = Integer.parseInt( input ); // wrap input to integer
		
		input = JOptionPane.showInputDialog( null, "Enter second number: " );
		secondNumber = Integer.parseInt( input ); // wrap input to integer
		
		input = JOptionPane.showInputDialog( null, "Enter third number: " );
		thirdNumber = Integer.parseInt( input ); // wrap input to integer
		

		// Calculate sum
		sum = firstNumber + secondNumber + thirdNumber;
		

		// Calculate average
		average = sum/3.0;
		

		// Build output string and display output
		result = "Average of " + firstNumber + ", " + secondNumber + " and " +
		thirdNumber + " is = " + average;

		JOptionPane.showMessageDialog( null, result, "Average of 3 Integers",
		JOptionPane.INFORMATION_MESSAGE );


	} // end method main

} // end class AverageThreeIntegers
