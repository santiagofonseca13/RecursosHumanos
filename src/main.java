import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class main extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 673, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "Gestor de Recursos Humanos", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, Color.BLUE));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DatosTrabajadores datosTrabajadores = new DatosTrabajadores();
		datosTrabajadores.textFieldCelular.setLocation(340, 108);
		datosTrabajadores.textFieldEdad.setLocation(340, 80);
		datosTrabajadores.textFieldRH.setLocation(340, 52);
		datosTrabajadores.textFieldIdentificacion.setLocation(340, 22);
		datosTrabajadores.setBounds(10, 28, 500, 246);
		contentPane.add(datosTrabajadores);
	}
}
