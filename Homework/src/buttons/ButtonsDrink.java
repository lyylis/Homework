package buttons;

/*
 * Currently not use. Remove before final submission.
 */

import hotDrinks.DispenseDrink;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonsDrink {
	public static void frame() {
		JFrame frame = new JFrame();
		frame.setTitle("Drinks");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		JRadioButton drink1 = new JRadioButton("Black Coffee");
		JRadioButton drink2 = new JRadioButton("Coffee and Cream");
		JRadioButton drink3 = new JRadioButton("Latte");
		JRadioButton drink4 = new JRadioButton("Cappuccino");
		JRadioButton drink5 = new JRadioButton("Espresso");
		JRadioButton drink6 = new JRadioButton("Hot Water");
		JRadioButton drink7 = new JRadioButton("Hot Chocolate");

		drink1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Drink Selected");
				DispenseDrink.dispenseDrink();
			}

		});

		ButtonGroup group = new ButtonGroup();
		group.add(drink1);
		group.add(drink2);
		group.add(drink3);
		group.add(drink4);
		group.add(drink5);
		group.add(drink6);
		group.add(drink7);

		panel.add(drink1);
		panel.add(drink2);
		panel.add(drink3);
		panel.add(drink4);
		panel.add(drink5);
		panel.add(drink6);
		panel.add(drink7);

		frame.getContentPane().add(panel);
		frame.setVisible(true);

	}
}
