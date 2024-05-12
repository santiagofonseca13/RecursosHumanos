import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class InterPreSociales extends JPanel {
	
	public List<PrestacionesSociales> DatosPres;

	public double cedula;
	public String cargo;
	
	public JTextField textFieldContrato;
	public JTextField textFieldSalario;
	public JTextField textFieldPensiones;
	public JTextField textFieldFechaInicio;
	public JTextField textFieldFechaVacaciones;
	public JTextField textFieldCesantias;
	public JTextField textFieldVacaciones;
	public JTextField textFieldPrima;
	public JComboBox comboBox;
	
	public main principal;
	
	public InterPreSociales(main principal) {
		this();
		this.principal = principal;
	}
	
	/**
	 *  Create the panel.
	 */
	public InterPreSociales() {
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Prestaciones", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		setLayout(null);

		DatosPres = new ArrayList<>();
		cargarDesdeArchivo();
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargo = (String) comboBox.getSelectedItem();
            }
        });
		comboBox.setModel(new DefaultComboBoxModel(new String[] {" Seleccione:", "Administrador", "Contador", "Secretario", "Vigilante", "Asesor"}));
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
		
		JLabel lblPrima = new JLabel("Prima:");
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
				guardarDatos();
			}
		});
		btnGuardar.setBounds(87, 302, 150, 23);
		add(btnGuardar);
	}
	
	
	public void guardarDatos() {
		boolean encontrado = false;
		for (PrestacionesSociales PrestacionesSociales: DatosPres) {
			if (PrestacionesSociales.getIdentificacion() == cedula) {
				PrestacionesSociales.setCargo(cargo);
	    		PrestacionesSociales.setCesantias(Double.parseDouble(textFieldCesantias.getText()));
	        	PrestacionesSociales.setVacacional(Double.parseDouble(textFieldVacaciones.getText()));            		
	        	PrestacionesSociales.setPrima(Double.parseDouble(textFieldPrima.getText()));
	        	PrestacionesSociales.setPension(Double.parseDouble(textFieldPensiones.getText()));
	        	PrestacionesSociales.setSalario(Double.parseDouble(textFieldSalario.getText()));
	        	PrestacionesSociales.setContrato(textFieldContrato.getText());    	        	
	        	PrestacionesSociales.setFechaInicio(textFieldFechaInicio.getText());
	    		PrestacionesSociales.setFechaVacaciones(textFieldFechaVacaciones.getText());
	    	    encontrado = true;
	    		JOptionPane.showMessageDialog(this, "Datos actualizados correctamente.");
	        	break;
			}
        }
		if (!encontrado) {
    		PrestacionesSociales P1 = new PrestacionesSociales(
    		cedula,Double.parseDouble(textFieldCesantias.getText()),
    		Double.parseDouble(textFieldVacaciones.getText()),
    		Double.parseDouble(textFieldPrima.getText()),
    		Double.parseDouble(textFieldPensiones.getText()),
    		Double.parseDouble(textFieldSalario.getText()),
    		textFieldContrato.getText(),
    		textFieldFechaInicio.getText(),
    		textFieldFechaVacaciones.getText(), cargo);
    		DatosPres.add(P1);
    		JOptionPane.showMessageDialog(this, "Datos guardados correctamente.");
	    }
		guardarEnArchivo();
	}

	public void guardarEnArchivo() {
		 try (BufferedWriter escribir = new BufferedWriter(new FileWriter("PrestacionesSociales.txt"))) {
	        	escribir.write("");
	            for (PrestacionesSociales PrestacionesSociales : DatosPres) {
	            	escribir.write(PrestacionesSociales.getIdentificacion()+"\t"+
	            			PrestacionesSociales.getCesantias()+"\t"+
	            			PrestacionesSociales.getVacacional()+"\t"+
	            			PrestacionesSociales.getPrima()+"\t"+
	            			PrestacionesSociales.getPension()+"\t"+
	            			PrestacionesSociales.getSalario()+"\t"+
	            			PrestacionesSociales.getContrato()+"\t"+
	            			PrestacionesSociales.getFechaInicio()+"\t"+
	            			PrestacionesSociales.getFechaVacaciones()+"\t"+
	            			PrestacionesSociales.getCargo());
	            	escribir.newLine();
	            }
	            escribir.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	            JOptionPane.showMessageDialog(this, "Error al guardar los datos.");
	       }
	}

	public void cargarDesdeArchivo() {
		try (BufferedReader leer = new BufferedReader(new FileReader("PrestacionesSociales.txt"))) {
            String linea="";
            while ((linea = leer.readLine()) != null) {
                String[] datos = linea.split("\t");
                if (datos.length == 10) {
                	double identificacion = Double.parseDouble(datos[0]);
                	double cesantias = Double.parseDouble(datos[1]);
                	double Vacacional = Double.parseDouble(datos[2]);
                	double prima = Double.parseDouble(datos[3]);
                	double pension = Double.parseDouble(datos[4]);
                	double salario = Double.parseDouble(datos[5]);
                    String contrato = datos[6];
                    String fechaInicio = datos[7];
                    String fechaVacaciones = datos[8];
                    String cargo = datos[9];

                    PrestacionesSociales Ps = new PrestacionesSociales(identificacion, cesantias, Vacacional, prima, pension,
                    		salario, contrato, fechaInicio, fechaVacaciones, cargo);
                    DatosPres.add(Ps);
                }
            }
        } catch (IOException e) {
           System.out.println("Error al leer el archivo");
        }
	}
	
	public void cargarDatosPorCedula(double cedula) {
	    for (PrestacionesSociales prestaciones : DatosPres) {
	        if (prestaciones.getIdentificacion() == cedula) {
	            textFieldCesantias.setText(String.valueOf(prestaciones.getCesantias()));
	            textFieldVacaciones.setText(String.valueOf(prestaciones.getVacacional()));
	            textFieldPrima.setText(String.valueOf(prestaciones.getPrima()));
	            textFieldPensiones.setText(String.valueOf(prestaciones.getPension()));
	            textFieldSalario.setText(String.valueOf(prestaciones.getSalario()));
	            textFieldContrato.setText(prestaciones.getContrato());
	            textFieldFechaInicio.setText(prestaciones.getFechaInicio());
	            textFieldFechaVacaciones.setText(prestaciones.getFechaVacaciones());
	            comboBox.setSelectedItem(prestaciones.getCargo());
	            return; 
	        }
	    }
	    limpiarCampos();
	}
	
	private void limpiarCampos() {
		comboBox.setSelectedIndex(0);
	    textFieldCesantias.setText("");
	    textFieldVacaciones.setText("");
	    textFieldPrima.setText("");
	    textFieldPensiones.setText("");
	    textFieldSalario.setText("");
	    textFieldContrato.setText("");
	    textFieldFechaInicio.setText("");
	    textFieldFechaVacaciones.setText("");
	}
}
