package buttons;

/*
 * Buttons for selecting additional (like sugar).
 */
import hotDrinks.Additional;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonAdditional {

	public static void frame2() {
		JFrame frame = new JFrame();
		frame.setTitle("Add Sugar and Cream");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JCheckBox jCheckBox = new JCheckBox();
		ButtonGroup bg = new ButtonGroup();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 2));
		for (Additional additional : Additional.values()) {
			JCheckBox btn2 = new JCheckBox();
			btn2.addActionListener(listener);
			btn2.setText(additional.toString());
			bg.add(btn2);
			panel.add(btn2);
			btn2 = jCheckBox;
			frame.getContentPane().add(panel);
			frame.setVisible(true);

		}
		boolean isButtonSelected = jCheckBox.isSelected();
		if (isButtonSelected) {
		} else {

		}

	}

	static ActionListener listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Proceed with drinks");
			ButtonDrinks.frame();
		}

	};
}
