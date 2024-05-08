import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class InterPreSociales extends JPanel {
	private JTextField textFieldPocicionCargo;
	private JTextField textFieldTipoContrato;
	private JTextField textFieldSalario;
	private JTextField textFieldPensiones;
	private JTextField textFieldFechaInicio;
	private JTextField textFieldFechaVacaciones;
	private JTextField textFieldCensatias;

	/**
	 * Create the panel.
	 */
	public InterPreSociales() {
		setLayout(null);
		
		JLabel lblPosicinCargo = new JLabel("Posición Cargo:");
		lblPosicinCargo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPosicinCargo.setBounds(10, 11, 74, 20);
		add(lblPosicinCargo);
		
		JLabel lblTipoDeContrato = new JLabel("Tipo de contrato:");
		lblTipoDeContrato.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipoDeContrato.setBounds(10, 42, 83, 20);
		add(lblTipoDeContrato);
		
		JLabel lblSalario = new JLabel("Salario: ");
		lblSalario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSalario.setBounds(10, 73, 44, 20);
		add(lblSalario);
		
		JLabel lblSeguro = new JLabel("Fecha de vacaciones:");
		lblSeguro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSeguro.setBounds(10, 167, 110, 20);
		add(lblSeguro);
		
		JLabel lblPensiones = new JLabel("Pensiones:");
		lblPensiones.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPensiones.setBounds(10, 104, 54, 20);
		add(lblPensiones);
		
		JLabel lblFechaDeInicio = new JLabel("Fecha de inicio:");
		lblFechaDeInicio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaDeInicio.setBounds(10, 136, 74, 20);
		add(lblFechaDeInicio);
		
		JLabel lblCesantias = new JLabel("Cesantias:");
		lblCesantias.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCesantias.setBounds(10, 198, 64, 20);
		add(lblCesantias);
		
		textFieldPocicionCargo = new JTextField();
		textFieldPocicionCargo.setBounds(137, 11, 86, 20);
		add(textFieldPocicionCargo);
		textFieldPocicionCargo.setColumns(10);
		
		textFieldTipoContrato = new JTextField();
		textFieldTipoContrato.setColumns(10);
		textFieldTipoContrato.setBounds(137, 42, 86, 20);
		add(textFieldTipoContrato);
		
		textFieldSalario = new JTextField();
		textFieldSalario.setColumns(10);
		textFieldSalario.setBounds(137, 73, 86, 20);
		add(textFieldSalario);
		
		textFieldPensiones = new JTextField();
		textFieldPensiones.setColumns(10);
		textFieldPensiones.setBounds(137, 104, 86, 20);
		add(textFieldPensiones);
		
		textFieldFechaInicio = new JTextField();
		textFieldFechaInicio.setColumns(10);
		textFieldFechaInicio.setBounds(137, 136, 86, 20);
		add(textFieldFechaInicio);
		
		textFieldFechaVacaciones = new JTextField();
		textFieldFechaVacaciones.setColumns(10);
		textFieldFechaVacaciones.setBounds(137, 167, 86, 20);
		add(textFieldFechaVacaciones);
		
		textFieldCensatias = new JTextField();
		textFieldCensatias.setColumns(10);
		textFieldCensatias.setBounds(137, 198, 86, 20);
		add(textFieldCensatias);

	}

}
