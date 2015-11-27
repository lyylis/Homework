package hotDrinks;
/*
 * return change if user entered more money than the unit price
 */
public class ChangeMoney {
	public static double issueChange(double payment){
		double change=0.0;
		
		change=payment-2.50;
		return change;
	}

}
