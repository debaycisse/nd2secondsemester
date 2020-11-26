package answer3;

public class odd_number {

	public static void main(String[] args) {

		int sum=0, counts=0;
		double average;
		
		System.out.println("The odd number, divisible be 5 are: ");
		for(int counter = 25; counter <= 50; counter++) {
			
			if(counter%5 == 0) {

				counts++;
				sum += counter;
				System.out.println(counter);
			}
		}
		
		// Convert the sum and counts to double, then compute for average
		average = (Double.valueOf(sum)) / (Double.valueOf(counts));
		
		System.out.println("\nThe average is : " + average);
		
	}

}
