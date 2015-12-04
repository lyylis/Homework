package hotDrinks;

/*
 * @author Lüüli Suuk IA17
 */
public class Start {

	public static void main(String[] args) {
		System.out.println("(Lüüli Suuk IA17) Hot Drinks Vending Machine");
		System.out.println("Welcome!");
		double money = 0.0;
		money = Payment.enterMoney();
		if (AmountMoney.moneyEnough(money)) { // checks does the amount of money
												// is enough
			Select.createDrinks();

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
