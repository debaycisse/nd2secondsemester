package answer2;

import java.util.Scanner;

public class triangle_methods2_copy {
	//Instantiated variables
		Scanner input = new Scanner(System.in);
		double angle, s, a, b, c, area, perimeter;
		
		// input method
		public void setAngle() {
			System.out.println("Input the angle: ");
			angle = input.nextDouble();
			
			
			
		}
		
		// fetch the three angles & compute for s
		public void getAngles(double ang_a, double ang_b, double ang_c) {
			a = ang_a;
			b = ang_b;
			c = ang_c;
			s = (a + b + c)/2;
		}
		
		// area method
		public void setArea() {
			area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		}
		
		// perimeter method
		public void setPerimeter() {
			perimeter = a + b + c;
		}
}