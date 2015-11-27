package hotDrinks;
/*
 * method that checks have user entered enough money.
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
