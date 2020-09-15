/*
 * This program calculates 15% discount a given price
*/
import java.util.Scanner;

public class Discount{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price: NGN");
		double price = input.nextDouble();
		double discountPrice = price * 0.85;
		System.out.format("Your price is NGN%.2f after the 15%% discount.", discountPrice);
	}
}
