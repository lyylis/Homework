package buttons;

/*
 * Buttons for selecting additional (like sugar).
 */
import hotDrinks.Additional;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class ButtonAdditional {

	public static void frame2() {

		JFrame frame = new JFrame();
		frame.setTitle("Add Sugar and Cream");
		frame.setSize(300, 160);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		List<JCheckBox> jCheckBox = new ArrayList<>();
		JPanel panel = new JPanel();
		for (Additional additional : Additional.values()) {
			JCheckBox btn2 = new JCheckBox();
			// btn2.addActionListener(listener);
			btn2.setText(additional.toString());
			panel.add(btn2);
			jCheckBox.add(btn2);
			frame.getContentPane().add(panel);
			frame.setVisible(true);

		}
		JButton OK = new JButton("OK");
		OK.setSize(30, 30);
		OK.addActionListener(listener);
		panel.add(OK);

	}

	static ActionListener listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			JOptionPane.showMessageDialog(null, "Proceed with drinks");
			ButtonDrinks.frame();
		}

	};
}
