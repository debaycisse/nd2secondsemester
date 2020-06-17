/*
 * Here is the actual program or application that makes use of the 
 * Circle class which is in the same directory - Week5, as this very file.
 */


import circle.Circle;

import javax.swing.JOptionPane;

public class CircleTest
{
	public static void main(String[] args)
	{
		// Declare local variables
		String input;
		String output;
		double newRadius = 0;


		// create an object of a Circle class and call the constructor method that does not have argument
		// in other words, a constructor that was declared without a argument in the Circle class file
		Circle circle1;  // a circle class' object is declared here and used as reference data type for variable - circle1
		circle1 = new Circle();  //  constructor method circle() without parameter is initialized here
					// as value for circle1 variable.


		// Now, let's declare the constructor that have parameter as declared in circle class file
		// this is declared and initialized simultaneously
		Circle circle2 = new Circle(5);  // the new keyword must be typed to create the new constructor method
		

		// display the status or radius in the above two variables, that is circle1 and circle2
		output = "Radius for circle1 is " + circle1.getRadius() + 
			" while area of circle is " + circle1.circleArea();
		JOptionPane.showMessageDialog(null, output, "circle1", JOptionPane.INFORMATION_MESSAGE);

		// let's do for circle2
		output = "Radius for circle2 is " + circle2.getRadius() +
			" while area of circle is " + circle2.circleArea();
		JOptionPane.showMessageDialog(null, output, "circle2", JOptionPane.INFORMATION_MESSAGE);


		// Allow user to input his or her own radius
		input = JOptionPane.showInputDialog(null, "Enter Radius: ");
		// convert the string value into diuble data type equivalent.
		// and stores it inside newRadius local variable
		newRadius = Double.parseDouble(input);


		// use circle1 object, since it has no radius, to reset the value of the radius.
		circle1.setRadius(newRadius);


		// display the output of the user's input for both radius and area of circle
		output = "Radius for user's input is " + circle1.getRadius() +
			" while area of circle is " + circle1.circleArea();
		JOptionPane.showMessageDialog(null, output, "User's input", JOptionPane.INFORMATION_MESSAGE);


	}
}
