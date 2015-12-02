package buttons;

/*
 * Buttons for user to select the drink.
 */
import hotDrinks.DispenseDrink;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonArray {
	static String[] drinks = { "Black Coffee", "Coffee and Cream", "Latte",
			"Cappuccino", "Espresso", "Hot Water", "Hot Chocolate" };
	static String[] additional = { "Sugar" };

	public static void frame() {
		JFrame frame = new JFrame();
		frame.setTitle("Drinks");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JRadioButton[][] jRadioButton = new JRadioButton[7][1];
		ButtonGroup bg = new ButtonGroup();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(7, 7));
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 1; j++) {

				JRadioButton btn = new JRadioButton();
				btn.addActionListener(listener);
				btn.setText(drinks[i] + additional[j]);
				bg.add(btn);
				panel.add(btn);
				btn = jRadioButton[i][j];
			}
		}

		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}

	static ActionListener listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Drink Selected");
			DispenseDrink.dispenseDrink();
		}
	};

}