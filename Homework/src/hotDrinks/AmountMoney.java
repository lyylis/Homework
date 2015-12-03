package hotDrinks;

/*
 * Method that checks the amount of money entered by the user.
 */
public class AmountMoney {
	public static boolean moneyEnough(double enteredMoney) {
		double price = Price.price;
		if (enteredMoney >= price) {
			return true;
		} else {
			return false;
		}
	}

}
