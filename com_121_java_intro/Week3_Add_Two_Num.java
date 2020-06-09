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

		// Accept values or data from user(s)
		System.out.println("Enter first integer number please: ");
		firstNumber = input.nextInt();

		System.out.println("Enter second integer number please: ");
		secondNumber = input.nextInt();


		// Calculate sum
		sum = firstNumber + secondNumber;

		// Display result
		System.out.println("Sum of " + firstNumber +  " and " + secondNumber + " is " + sum);

	}  // end of main method block

}  // end of Week3_Add_Two_Num class
