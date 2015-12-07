package lib;

import hotDrinks.Price;

import java.awt.Component;

import javax.swing.*;

/*
 * Copied base code from: https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
 */

public class MoneyInputScreen {
	public static Double userInput() {

		Component frame = null;
		String s = (String) JOptionPane.showInputDialog(frame, "Please pay ("
				+ Price.price + ")", null, JOptionPane.PLAIN_MESSAGE);
		
		double sv = Double.parseDouble(s); //String value is turned into double
		return sv;

	}

	
}
