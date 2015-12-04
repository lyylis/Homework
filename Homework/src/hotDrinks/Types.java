package hotDrinks;

public enum Types {
	COFFEE("Black Coffee"),
	COFFEEANDCREAM("Coffee and Cream"),
	LATTE("Latte"), 
	CAPPUCCINO("Cappuccino"), 
	ESPRESSO("Espresso"), 
	HOTWATER("Hot Water"), 
	HOTCHOCOLATE("Hot Chocolate");
	
	String text;
	
	private Types(String text) {
		this.text = text;
	}

	public String toString() {
		return text;
//		String name = "";
//		switch (this) {
//		case COFFEE:
//			name = "Black Coffee";
//			break;
//		case COFFEEANDCREAM:
//			name = "Coffee and Cream";
//			break;
//		case LATTE:
//			name = "Latte";
//			break;
//		case CAPPUCCINO:
//			name = "Cappuccino";
//			break;
//		case ESPRESSO:
//			name = "Espresso";
//			break;
//		case HOTWATER:
//			name = "Hot Water";
//			break;
//		case HOTCHOCOLATE:
//			name = "Hot Chocolate";
//			break;
//		}
//
//		return name;

	}
}
