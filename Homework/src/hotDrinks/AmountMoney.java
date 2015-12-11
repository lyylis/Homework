package hotDrinks;

/**
 * @param enteredMoney
 * @return true if amount entered is greater than or equal to price, false if
 *         amount is less
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
