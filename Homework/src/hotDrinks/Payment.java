package hotDrinks;

import java.util.Scanner;

public class Payment {
	public static double enterMoney(){
		Scanner input = new Scanner(System.in);
		double payAmount=0.0;
		System.out.print("Please pay:");
		payAmount=input.nextDouble();
		
		return payAmount;
		
	}

}
