package answer2;

import answer2.triangle_methods;

public class triangle {

	public static void main(String[] args) {
		double a, b, c, perimeter, area;
		triangle_methods triangle_object = new triangle_methods();
		
		// get the values for the three sides
		triangle_object.inputSides();
		
		a = triangle_object.a;
		b = triangle_object.b;
		c = triangle_object.c;
		
		
		// retrieve the value for area
		triangle_object.computeArea();
		area = triangle_object.area;
		
		
		// retrieve the value for perimeter
		triangle_object.computePerimeter();
		perimeter = triangle_object.perimeter;
		
		
		
		// output the sides, area and perimeter
		System.out.println("The Sides are as follow: \nSide 'a' -> " + a +
				"\nSide 'b' -> " + b + "\nSide 'c' -> " + c +
				"\nArea -> " + area +
				"\nPerimeter -> " + perimeter);
	}

}
