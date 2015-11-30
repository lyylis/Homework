package hotDrinks;

import java.util.ArrayList;

public class Start {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		double money = 0.0;
		money = Payment.enterMoney();
		ArrayList<Select> choice;
		choice = Select.createDrinks();

		if (AmountMoney.moneyEnough(money)) { // checks does the amount of money
												// is enough

			choice = new ArrayList<Select>();

			DispenseDrink.dispenseDrink();

		} else {
			Notify.notify("Not enough money!"); // user has entered less money
												// than the unit price

		}
		if (money > Price.price) {
			System.out.println("\nPlease take change "
					+ ChangeMoney.issueChange(money)); // change is returned to
														// user
		}

	}

}
