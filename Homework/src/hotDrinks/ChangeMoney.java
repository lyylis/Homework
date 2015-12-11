package hotDrinks;

/**
 * @param payment
 * @return Calculate change and return it to user
 */
public class ChangeMoney {
	public static double issueChange(double payment) {
		double change = 0.0;

		change = payment - 2.50;
		return change;
	}

}
