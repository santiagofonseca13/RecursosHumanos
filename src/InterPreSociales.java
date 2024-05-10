import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class InterPreSociales extends JPanel {
	public JTextField textFieldCargo;
	public JTextField textFieldTipoContrato;
	public JTextField textFieldSalario;
	public JTextField textFieldPensiones;
	public JTextField textFieldFechaInicio;
	public JTextField textFieldFechaVacaciones;
	public JTextField textFieldCesantias;
	/**
	 * Prima
Vacaciones
FechaVacaciones
FechaInicio

	 * Create the panel.
	 */
	public InterPreSociales() {
		setLayout(null);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setHorizontalAlignment(SwingConstants.LEFT);
		lblCargo.setBounds(10, 11, 149, 20);
		add(lblCargo);
		
		JLabel lblTipoDeContrato = new JLabel("Tipo de contrato:");
		lblTipoDeContrato.setHorizontalAlignment(SwingConstants.LEFT);
		lblTipoDeContrato.setBounds(10, 42, 149, 20);
		add(lblTipoDeContrato);
		
		JLabel lblSalario = new JLabel("Salario: ");
		lblSalario.setHorizontalAlignment(SwingConstants.LEFT);
		lblSalario.setBounds(10, 73, 149, 20);
		add(lblSalario);
		
		JLabel lblSeguro = new JLabel("Fecha de vacaciones:");
		lblSeguro.setHorizontalAlignment(SwingConstants.LEFT);
		lblSeguro.setBounds(10, 167, 149, 20);
		add(lblSeguro);
		
		JLabel lblPensiones = new JLabel("Pensiones:");
		lblPensiones.setHorizontalAlignment(SwingConstants.LEFT);
		lblPensiones.setBounds(10, 104, 149, 20);
		add(lblPensiones);
		
		JLabel lblFechaDeInicio = new JLabel("Fecha de inicio:");
		lblFechaDeInicio.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaDeInicio.setBounds(10, 136, 149, 20);
		add(lblFechaDeInicio);
		
		JLabel lblCesantias = new JLabel("Cesantias:");
		lblCesantias.setHorizontalAlignment(SwingConstants.LEFT);
		lblCesantias.setBounds(10, 198, 149, 20);
		add(lblCesantias);
		
		textFieldCargo = new JTextField();
		textFieldCargo.setBounds(181, 11, 181, 20);
		add(textFieldCargo);
		textFieldCargo.setColumns(10);
		
		textFieldTipoContrato = new JTextField();
		textFieldTipoContrato.setColumns(10);
		textFieldTipoContrato.setBounds(181, 42, 181, 20);
		add(textFieldTipoContrato);
		
		textFieldSalario = new JTextField();
		textFieldSalario.setColumns(10);
		textFieldSalario.setBounds(181, 73, 181, 20);
		add(textFieldSalario);
		
		textFieldPensiones = new JTextField();
		textFieldPensiones.setColumns(10);
		textFieldPensiones.setBounds(181, 104, 181, 20);
		add(textFieldPensiones);
		
		textFieldFechaInicio = new JTextField();
		textFieldFechaInicio.setColumns(10);
		textFieldFechaInicio.setBounds(181, 136, 181, 20);
		add(textFieldFechaInicio);
		
		textFieldFechaVacaciones = new JTextField();
		textFieldFechaVacaciones.setColumns(10);
		textFieldFechaVacaciones.setBounds(181, 167, 181, 20);
		add(textFieldFechaVacaciones);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(70, 231, 89, 23);
		add(btnGuardar);

		textFieldCesantias = new JTextField();
		textFieldCesantias.setColumns(10);
		textFieldCesantias.setBounds(181, 198, 181, 20);
		add(textFieldCesantias);


	}
}
