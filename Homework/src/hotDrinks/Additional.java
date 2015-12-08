package hotDrinks;

/*
 * List of additional selections
 */
public enum Additional {
	SUGAR("Sugar"), CREAM("Cream");

	String text;

	private Additional(String text) {
		this.text = text;
	}

	public String toString() {
		return text;

	}

}
