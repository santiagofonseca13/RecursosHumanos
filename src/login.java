import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class login extends JPanel {
	private JTextField textFieldUsuario;
	private JTextField textFieldContraseña;

	public login() {
		setLayout(null);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(87, 33, 123, 20);
		add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setBounds(23, 33, 54, 20);
		add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña: ");
		lblContraseña.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContraseña.setBounds(10, 75, 74, 20);
		add(lblContraseña);
		
		textFieldContraseña = new JTextField();
		textFieldContraseña.setColumns(10);
		textFieldContraseña.setBounds(87, 75, 123, 20);
		add(textFieldContraseña);

	}
}
