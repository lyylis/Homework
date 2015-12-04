package lib;

import hotDrinks.Price;

import java.awt.Component;

import javax.swing.*;

/*
 * Copied base code from: https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
 */

public class MoneyInputScreen {
	public static Double userInput() {

		// Object[] possibilities = {"ham", "spam", "yam"};
		Component frame = null;
		String s = (String) JOptionPane.showInputDialog(frame, "Please pay ("
				+ Price.price + ")", null, JOptionPane.PLAIN_MESSAGE);
		{

			// If a string was returned, say so.
			if ((s != null) && (s.length() > 0)) {
				setLabel("Paid " + s + "!");
				//return;
			}

			// If you're here, the return value was null/empty.
			setLabel("No payment made!");

		}
		double sv = Double.parseDouble(s); //String value is turned into double
		return sv;

	}

	private static void setLabel(String string) {
		// TODO Auto-generated method stub
		
	}
}
