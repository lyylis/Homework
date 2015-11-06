package hotDrinks;
/*
 * User selection
 */
import java.util.ArrayList;

public class Select {

	public Select(Types type, Additional additional) {
		// TODO Auto-generated constructor stub
	}

	public static ArrayList<Select> createDrinks() {
		ArrayList<Select> combination = new ArrayList<Select>();

		for (Types type : Types.values()) {
			for (Additional additional : Additional.values()) {

				combination.add(new Select(type, additional));
			}

		}

		return combination;
	}
	

}
