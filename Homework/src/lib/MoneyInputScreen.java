package lib;

import hotDrinks.Price;

import java.awt.Component;

import javax.swing.*;

/*
 * Copied code: https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
 */

public class MoneyInputScreen {
	// Object[] possibilities = {"ham", "spam", "yam"};
	private Component frame;
	String s = (String) JOptionPane.showInputDialog(frame, "Please pay ("+Price.price+")" ,
			JOptionPane.PLAIN_MESSAGE);
	{

		// If a string was returned, say so.
		if ((s != null) && (s.length() > 0)) {
			setLabel("Paid " + s + "!");
			//return;
		}

		// If you're here, the return value was null/empty.
		setLabel("No payment made!");

	}
	private void setLabel(String string) {
		// TODO Auto-generated method stub
		
	}
}