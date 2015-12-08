package hotDrinks;

/*
 * List of Drinks
 */
public enum Types {
	COFFEE("Black Coffee"), COFFEEANDCREAM("Coffee and Cream"), LATTE("Latte"), CAPPUCCINO(
			"Cappuccino"), ESPRESSO("Espresso"), HOTWATER("Hot Water"), HOTCHOCOLATE(
			"Hot Chocolate");

	String text;

	private Types(String text) {
		this.text = text;
	}

	public String toString() {
		return text;

	}
}
