package answer2;

import java.util.Scanner;

public class triangle_methods {
	// Instantiated variables
	Scanner input = new Scanner(System.in);
	double angle, s, a, b, c, area, perimeter;
	
	// input method
	public void inputSides() {
		System.out.println("Input the side 'a' : ");
		a = input.nextDouble();
		
		System.out.println("Input the side 'b' : ");
		b = input.nextDouble();
		
		System.out.println("Input the side 'c' : ");
		c = input.nextDouble();
	}  // end of inputSides method
	
	// fetch the three angles & compute for s
//	private void getAngles(double ang_a, double ang_b, double ang_c) {
//		s = (ang_a + ang_b + ang_c) / 2.0;
//	}
	
	// area method
	public void computeArea() {
//		getAngles(a, b, c);
		s = (a + b + c) / 2.0;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}  // end of computeArea
	
	// perimeter method
	public void computePerimeter() {
		perimeter = a + b + c;
	}  // end of computePerimeter

}
