import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class TablaEmpleados extends JPanel{
	
	private JTable table;
	private DefaultTableModel model;
	
	public main principal;
	
	public TablaEmpleados(main principal) {
		this();
		this.principal = principal;
	}
	
	/**
	 * Create the panel.
	 */
	public TablaEmpleados() {
		setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Empleados", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)), "", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 21, 430, 495);
		add(scrollPane);
		
		table = new JTable();
		model=new DefaultTableModel();
		table.setModel(model);
		model.addColumn("Identificacion");
		model.addColumn("Nombres");
		model.addColumn("Apellidos");
		model.addColumn("Correo");
		model.addColumn("Celular");
		scrollPane.setViewportView(table);
	}
	public void setTrabajadores(DatosTrabajadores DatosTrabajadores) {
		this.principal.datosTrabajadores=DatosTrabajadores;
	}
	
	public void LLenarTabla() {
		model.setRowCount(0);
		
		List<Trabajador>listaTrabajadores = principal.datosTrabajadores.getLista();
		for (Trabajador Trabajador: listaTrabajadores) {
			Object[] fila = new Object [5];
			fila[0]=Trabajador.getIdentificacion();
			fila[1]=Trabajador.getNombres();
			fila[2]=Trabajador.getApellidos();
			fila[3]=Trabajador.getCorreo();
			fila[4]=Trabajador.getNumero();
			
			model.addRow(fila);
		}
	}
	
}