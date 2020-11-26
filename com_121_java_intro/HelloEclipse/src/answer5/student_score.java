package answer5;

public class student_score {

	public static void main(String[] args) {
	
		double average;
		double sum=0;
		int counts = 0, counts_above_70 = 0;
		
		double marks[] = {60.0, 82.7, 72.0, 37.6, 45.0, 56.4, 67.5, 
				87.0, 89.2, 34.3, 77.2, 65.5, 50.4, 67.2, 77.3};
		
		// Calculate the sum of all scores
		for(int counter=0; counter < marks.length; counter++) {
			counts++;
			sum += marks[counter];
		}
		
		// compute the average and prints it out
		average = sum / counts;
		System.out.println("The Average of all scores is : "+ average);
		
		
		// compute for number of scores of 70 and above
		for(int counter=0; counter < marks.length; counter++) {
			if(marks[counter] >= 70.0) {
				counts_above_70++;
			}
		}
		
		System.out.println("Total number of scores that are 70 or above is : " + counts_above_70);
	}

}
