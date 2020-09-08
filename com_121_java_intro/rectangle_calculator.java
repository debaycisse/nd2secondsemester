/*
 * This application calculates and
 * outputs the area and perimeter of rectangle
 * 
 * Name: ADEBAYO AZEEZ SEYI
 * Matric. No.: P/ND/18/3210027
 *  
 */

package classwork.exercise;

import java.util.Scanner;

public class rectrangle_calculator {

	public static void main(String[] args) {
		// variable declaration for sides
		double length;
		double breadth;
		double area;
		double perimeter;
		
		// declaration of input data type with scanner class
		Scanner input = new Scanner(System.in);
		
		// fetching input values for the sides
		System.out.print("Type in the length value: ");
		length = input.nextDouble();
		
		System.out.print("\nType in the breadth value: ");
		breadth = input.nextDouble();
		
		// Computation of area of rectangle
		area = length * breadth ;
		
		// Computation of perimeter of rectangle
		perimeter = 2 * (length + breadth);
		
		// Displaying the output of the sides, area and perimeter
		System.out.println("\nThe sides are:-  \nlength -> " + length +
				"\nbreadth -> " + breadth);
		
		System.out.println("\nThe area is " + area);
		
		System.out.println("\nThe Perimeter is " + perimeter);
		
	}

}
