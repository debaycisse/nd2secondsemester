/*
 *  Add two numbers
 *  using graphical windows
 */

import javax.swing.JOptionPane;

public class Week3_Add_Two_Num_Gui
{
	public static void main(String[] args)
	{
		// declare primitive variables
		int firstNumber = 10 ;
		int secondNumber = 20 ;
		int sum = 0;

		String input;  // for accepting input from user
		String output;  // for displaying the result


		// Accept value from user(s)
		input = JOptionPane.showInputDialog(null, "Enter first integer number", "Adding integers", 
				JOptionPane.QUESTION_MESSAGE);

		// Convert value of input into integer & store it in firstNumber variable
		firstNumber = Integer.parseInt(input);


		input = JOptionPane.showInputDialog(null, "Enter the second integer number please", "Adding integers",
				JOptionPane.QUESTION_MESSAGE);
		secondNumber = Integer.parseInt(input);


		// Add the values of the two variables together & store the result in sum variable
		sum = firstNumber + secondNumber;

		// Consruct output format
		output = "Sum of " + firstNumber + " and " + secondNumber + " is " + sum;

		
		// Display the output
		JOptionPane.showMessageDialog(null, output, "Result - Adding two integers",
				JOptionPane.INFORMATION_MESSAGE);
	} // end of main method block

}  // end of Week3_Add_Two_Num_Gui class

