package hotDrinks;

public enum Additional {
	CREAM, SUGAR;

	public String toString() {
		String name = "";
		switch (this) {
		case CREAM:
			name = "Cream";
			break;
		case SUGAR:
			name = "Sugar";
			break;

		}

		return name;

	}

}
