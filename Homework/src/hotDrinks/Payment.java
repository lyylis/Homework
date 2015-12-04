package hotDrinks;
/*
 * User enters money into the vending machine.
 */
//import java.util.Scanner;

import lib.MoneyInputScreen;

public class Payment {
	public static double enterMoney(){
		//@SuppressWarnings("resource")
		//Scanner input = new Scanner(System.in);
		MoneyInputScreen.userInput();
		
		Double payAmount=0.0;
		payAmount=MoneyInputScreen.userInput();
		
		return payAmount;
	
	}
 
}
