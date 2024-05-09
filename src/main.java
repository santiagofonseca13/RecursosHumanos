import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.util.List;

public class main extends JFrame {

	public JPanel contentPane;
	public TablaEmpleados tablaEmpleados;
	public InterPreSociales interPreSociales;
	public DatosTrabajadores datosTrabajadores;

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
		setBounds(100, 100, 994, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "Gestor de Recursos Humanos", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, Color.BLUE));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		interPreSociales = new InterPreSociales();
		interPreSociales.setBounds(10, 273, 405, 255);
		contentPane.add(interPreSociales);
		
		tablaEmpleados = new TablaEmpleados(this);
		tablaEmpleados.setBounds(520, 28, 448, 500);
		contentPane.add(tablaEmpleados);
		
		datosTrabajadores = new DatosTrabajadores(this);
		datosTrabajadores.setBounds(10, 28, 500, 240);
		contentPane.add(datosTrabajadores);
		
		
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
}
