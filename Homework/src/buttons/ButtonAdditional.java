package buttons;

/*
 * Buttons for selecting additional (like sugar).
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonAdditional {

	public static String[] additional = { "Yes", "No" };

	public static void frame2() {
		JFrame frame = new JFrame();
		frame.setTitle("Add Sugar");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JRadioButton jRadioButton2 = new JRadioButton();
		ButtonGroup bg = new ButtonGroup();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 2));
		for (int j = 0; j < 2; j++) {
			JRadioButton btn2 = new JRadioButton();
			btn2.addActionListener(listener);
			btn2.setText(additional[j]);
			bg.add(btn2);
			panel.add(btn2);
			btn2 = jRadioButton2;
			frame.getContentPane().add(panel);
			frame.setVisible(true);

		}
		boolean isButtonSelected = jRadioButton2.isSelected();
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
