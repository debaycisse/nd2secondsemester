/*
 *  This program adds two numbers together
 *
 */

import java.util.Scanner;

public class Week3_Add_Two_Num
{
	public static void main(String[] args)
	{
		// declaration of primitive variables
		// int firstNumber = 10, secondNumber = 20, sum = 0;  or
		int firstNumber = 10;
		int secondNumber = 20;
		int sum = 0;


		sum = firstNumber + secondNumber;


		System.out.println("Sum of " + firstNumber + " and " + secondNumber + " is " + sum);



		// Declaration of non-primitive (reference) variable of type Scanner
		Scanner input = new Scanner(System.in);
		// Scanner is data type of reference type, so input is a variable of datatype Scanner
		// Scanner() method is used to scan whatever object that is given to it's parameter
		// System.in - is an object that hooks up system's input, such as keyboard.


		// Accept values or data from user(s)
		System.out.println("Enter first integer number please: ");  // informs user on what to type in.
		firstNumber = input.nextInt();  // scans input stream and stores the value in d variable

		System.out.println("Enter second integer number please: ");
		secondNumber = input.nextInt();


		// Calculate sum
		sum = firstNumber + secondNumber;

		// Display result
		System.out.println("Sum of " + firstNumber +  " and " + secondNumber + " is " + sum);

	}  // end of main method block

}  // end of Week3_Add_Two_Num class
