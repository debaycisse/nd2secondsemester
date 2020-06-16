/*
 * Circle.java
 * Create a Circle Object and Calculate the Area of the Circle
 */

public class Circle
{
	// Create Instance Variables
	private double radius;


	// Create Constructor method without parameter
	// Note, a name of constructor method must be the same as the class' name
	public Circle(){
		radius = 0;  // above radius variable is given a value (that is 0)
	}


	// Another Constructor method with parameter
	// Note that the name is the same as the class' name
	public Circle(double r){
		setRadius(r);    // Another method -setRadius() in this class is called here, eventhough it is not yet defined
	}

	
	// the below method resets the value of the above instance variable (radius) to the value of its argument
	public void setRadius(double r){
		radius = r;
	}


	// the below obtains the value of the above instance variable (radius) and returns it to the object that calls it.
	// it is only returning the current value of the instance variable as at the time when this method is called or invoked
	public double getRadius(){
		return radius;
	}


	// the below calculates the area of a circle, using the given radius value.
	public double circleArea(){
		return Math.PI * Math.pow(radius, 2);
	}
}
