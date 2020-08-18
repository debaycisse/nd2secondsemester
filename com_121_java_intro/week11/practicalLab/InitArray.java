package week11.practicalLab;

public class InitArray {

	public static void main(String[] args) {
		int array[];	// declaration of array
		
		array = new int[10];	// creation of the required number of elements
		
		System.out.println("Index   Value");
		
		for(int counter = 0; counter < array.length; counter++){
			System.out.println("  " + counter + "       "  + array[counter]);
		}

	}

}
