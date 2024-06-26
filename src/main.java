import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class main extends JFrame {

	public JPanel contentPane;
	public TablaEmpleados tablaEmpleados;
	public InterPreSociales interPreSociales;
	public DatosTrabajadores datosTrabajadores;
	public login login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 994, 663);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "Gestor de Recursos Humanos", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, Color.BLUE));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		login = new login(this);
		login.setBounds(348, 115, 331, 284);
		contentPane.add(login);
		login.setVisible(true);
		
		interPreSociales = new InterPreSociales();
		interPreSociales.setBounds(10, 273, 500, 312);
		contentPane.add(interPreSociales);
		interPreSociales.setVisible(false);
		
		tablaEmpleados = new TablaEmpleados(this);
		tablaEmpleados.setBounds(520, 28, 448, 557);
		contentPane.add(tablaEmpleados);
		tablaEmpleados.setVisible(false);
		
		datosTrabajadores = new DatosTrabajadores(this);
		datosTrabajadores.setBounds(10, 28, 500, 240);
		contentPane.add(datosTrabajadores);
		datosTrabajadores.setVisible(false);
		
	}
	public void mostrarPanelPrincipal() {
        login.setVisible(false);
        interPreSociales.setVisible(true);
        tablaEmpleados.setVisible(true);
        datosTrabajadores.setVisible(true);
    }
	public TablaEmpleados getTablaEmpleados() {
		return tablaEmpleados;
	}
	public InterPreSociales getInterPreSociales() {
		return interPreSociales;
	}
	public DatosTrabajadores getDatosTrabajadores() {
		return datosTrabajadores;
	}
	public void dispose() {	
	}
	public login getLogin() {
		return login;
	}
}
