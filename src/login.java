import javax.swing.JPanel;
import javax.swing.JTextField;

public class login extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public login() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(25, 31, 86, 20);
		add(textField);
		textField.setColumns(10);

	}
}
