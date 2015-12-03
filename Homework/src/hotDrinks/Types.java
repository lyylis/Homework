package hotDrinks;

public enum Types {
	COFFEE, COFFEEANDCREAM, LATTE, CAPPUCCINO, ESPRESSO, HOTWATER, HOTCHOCOLATE;

	public String toString() {
		String name = "";
		switch (this) {
		case COFFEE:
			name = "Black Coffee";
			break;
		case COFFEEANDCREAM:
			name = "Coffee and Cream";
			break;
		case LATTE:
			name = "Latte";
			break;
		case CAPPUCCINO:
			name = "Cappuccino";
			break;
		case ESPRESSO:
			name = "Espresso";
			break;
		case HOTWATER:
			name = "Hot Water";
			break;
		case HOTCHOCOLATE:
			name = "Hot Chocolate";
			break;
		}

		return name;

	}
}
