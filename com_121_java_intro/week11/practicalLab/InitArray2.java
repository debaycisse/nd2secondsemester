package week11.practicalLab;

public class InitArray2 {

	public static void main(String[] args) {
		// initializer list - used to specify the value for each element
		int array[] = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
		
		System.out.println("Index   Value");
		
		for(int counter = 0; counter < array.length; counter++){
			System.out.println("  " + counter + "      " + array[counter]);
		}

	}

}
