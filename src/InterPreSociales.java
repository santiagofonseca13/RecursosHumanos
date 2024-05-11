import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class InterPreSociales extends JPanel {

	public List<Trabajador> Trabajador = new ArrayList<>();
	public JTextField textFieldContrato;
	public JTextField textFieldSalario;
	public JTextField textFieldPensiones;
	public JTextField textFieldFechaInicio;
	public JTextField textFieldFechaVacaciones;
	public JTextField textFieldCesantias;
	private JTextField textFieldVacaciones;
	private JTextField textFieldPrima;
	/**
	 * Prima
Vacaciones
FechaVacaciones
FechaInicio

	 * Create the panel.
	 */
	public InterPreSociales() {
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Prestaciones", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {" Seleccione:", "", "Administrador", "Contador", "Secretario", "Vigilante", "Asesor"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(159, 23, 150, 22);
		add(comboBox);
		
		JLabel lblCargo = new JLabel("Cargo:");

		lblCargo.setBackground(Color.BLACK);
		lblCargo.setBounds(10, 24, 139, 20);
		add(lblCargo);
		
		JLabel lblContrato = new JLabel("Tipo de contrato:");
		lblContrato.setBounds(10, 55, 139, 20);
		add(lblContrato);
		
		JLabel lblFechaVacaciones = new JLabel("Fecha de vacaciones:");
		lblFechaVacaciones.setBounds(10, 117, 139, 20);
		add(lblFechaVacaciones);
		
		JLabel lblPensiones = new JLabel("Pensiones:");
		lblPensiones.setBounds(10, 240, 139, 20);
		add(lblPensiones);
		
		JLabel lblFechaInicio = new JLabel("Fecha de inicio:");
		lblFechaInicio.setBounds(10, 86, 139, 20);
		add(lblFechaInicio);
		
		JLabel lblSalario = new JLabel("Salario: ");
		lblSalario.setBounds(10, 148, 139, 20);
		add(lblSalario);
		
		JLabel lblCesantias = new JLabel("Cesantias:");
		lblCesantias.setBounds(10, 179, 139, 20);
		add(lblCesantias);
		

		JLabel lblVacaciones = new JLabel("Vacaciones:");
		lblVacaciones.setBounds(10, 271, 139, 20);
		add(lblVacaciones);
		
		JLabel lblPrima = new JLabel("Prima:\r\n");
		lblPrima.setBounds(10, 210, 139, 20);
		add(lblPrima);
		
		
		textFieldContrato = new JTextField();
		textFieldContrato.setColumns(10);
		textFieldContrato.setBounds(159, 55, 150, 20);
		add(textFieldContrato);

		textFieldSalario = new JTextField();
		textFieldSalario.setColumns(10);
		textFieldSalario.setBounds(159, 148, 150, 20);
		add(textFieldSalario);
		
		textFieldPensiones = new JTextField();
		textFieldPensiones.setColumns(10);
		textFieldPensiones.setBounds(159, 240, 150, 20);
		add(textFieldPensiones);
		
		textFieldFechaInicio = new JTextField();
		textFieldFechaInicio.setColumns(10);
		textFieldFechaInicio.setBounds(159, 86, 150, 20);
		add(textFieldFechaInicio);
		
		textFieldFechaVacaciones = new JTextField();
		textFieldFechaVacaciones.setColumns(10);
		textFieldFechaVacaciones.setBounds(159, 117, 150, 20);
		add(textFieldFechaVacaciones);
		
		textFieldCesantias = new JTextField();
		textFieldCesantias.setColumns(10);
		textFieldCesantias.setBounds(159, 179, 148, 20);
		add(textFieldCesantias);
		
		textFieldVacaciones = new JTextField();
		textFieldVacaciones.setColumns(10);
		textFieldVacaciones.setBounds(159, 271, 150, 20);
		add(textFieldVacaciones);
		
		textFieldPrima = new JTextField();
		textFieldPrima.setColumns(10);
		textFieldPrima.setBounds(159, 210, 150, 20);
		add(textFieldPrima);
		
		JButton btnGuardar = new JButton("Guardar");

		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(170, 302, 150, 23);
		add(btnGuardar);
	}
}
