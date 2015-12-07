package buttons;

/*
 * Buttons select the drink.
 */
import hotDrinks.DispenseDrink;
import hotDrinks.Types;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonDrinks {

	public static void frame() {
		JFrame frame = new JFrame();
		frame.setTitle("Drinks");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JRadioButton jRadioButton = new JRadioButton();
		ButtonGroup bg = new ButtonGroup();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(7, 7));
		for (Types type : Types.values()) {
			JRadioButton btn = new JRadioButton();
			btn.addActionListener(listener);
			btn.setText(type.toString());
			bg.add(btn);
			panel.add(btn);
			btn = jRadioButton;
			frame.getContentPane().add(panel);
			frame.setVisible(true);
			

		}
		boolean isButtonSelected = jRadioButton.isSelected();
		if (isButtonSelected) {
		} else {

		}

	}

	static ActionListener listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Drink Selected");
			DispenseDrink.dispenseDrink();
		
			System.exit(0);
		}

		
	};
}
