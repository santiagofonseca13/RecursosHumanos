import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JPanel {
	private JTextField txtUsuario;
	private JPasswordField jpassContraseña;
	private JButton btnIngresar;
	
public main principal;
	
	public login(main principal) {
		this();
		this.principal = principal;
	}

	public login() {
		setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(87, 60, 123, 20);
		add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setBounds(23, 60, 54, 20);
		add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña: ");
		lblContraseña.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContraseña.setBounds(10, 102, 74, 20);
		add(lblContraseña);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] contraseña=jpassContraseña.getPassword();
				String ContraseñaFinal = new String (contraseña);
				
				if(txtUsuario.getText().equals("Santivenjuli")&& ContraseñaFinal.equals("123")) {
					dispose ();
					JOptionPane.showMessageDialog(null, "Bienvenido al sistema!!", "INGRESASTE",
							JOptionPane.INFORMATION_MESSAGE);
					principal.mostrarPanelPrincipal();
				}else {
					JOptionPane.showMessageDialog(null,"Usuario o contraseña están incorrectos","Error al ingresar",
							JOptionPane.ERROR_MESSAGE);
					txtUsuario.setText("");
					jpassContraseña.setText("");
					txtUsuario.requestFocus();
				}
			}

			
		});
		btnIngresar.setBounds(97, 144, 89, 23);
		add(btnIngresar);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(123, 23, 46, 14);
		add(lblNewLabel);
		
		jpassContraseña = new JPasswordField();
		jpassContraseña.setBounds(87, 102, 123, 20);
		add(jpassContraseña);
		

	}

	protected void dispose() {
		// TODO Auto-generated method stub
		
	}
}
