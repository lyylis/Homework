package hotDrinks;
/*
 * User enters money into the vending machine.
 */
import java.util.Scanner;

public class Payment {
	public static double enterMoney(){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double payAmount=0.0;
		System.out.print("Please pay (price "+ Price.price+ "):");
		payAmount=input.nextDouble();
		
		return payAmount;
		
	}
 
}
