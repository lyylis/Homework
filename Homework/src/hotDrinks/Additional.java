package hotDrinks;

public enum Additional {
	SUGAR;

	public String toString() {
		String name = "";
		switch (this) {
		case SUGAR:
			name = "Sugar";
			break;

		}

		return name;

	}

}
