package hotDrinks;

/**
 * @return money payed into the vending machine
 */
import lib.MoneyInputScreen;

public class Payment {
	public static double enterMoney() {

		Double payAmount = 0.0;
		payAmount = MoneyInputScreen.userInput();

		return payAmount;

	}

}
