import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class DatosTrabajadores extends JPanel {
	
	public List<Trabajador> listaTrabajadores = new ArrayList<>();
	public double cedula;
	
	//Texto de prueba
	
	public JTextField textFieldNombre;
	public JTextField textFieldApellido;
	public JTextField textFieldIdentificacion;
	public JTextField textFieldRH;
	public JTextField textFieldCelular;
	public JTextField textFieldDireccion;
	public JTextField textFieldCorreo;
	public JTextField textFieldSeguro;
	public JTextField textFieldCesantias;
	public JTextField textFieldEdad;
	
	public DatosTrabajadores() {
		setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos Personales", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)), "Datos Personales", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(10, 25, 60, 14);
        add(lblNombre);

        textFieldNombre = new JTextField();
        textFieldNombre.setBounds(80, 22, 150, 20);
        add(textFieldNombre);
        textFieldNombre.setColumns(10);

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(10, 55, 60, 14);
        add(lblApellido);

        textFieldApellido = new JTextField();
        textFieldApellido.setBounds(80, 52, 150, 20);
        add(textFieldApellido);
        textFieldApellido.setColumns(10);

        JLabel lblIdentificacion = new JLabel("Identificación:");
        lblIdentificacion.setBounds(250, 28, 80, 14);
        add(lblIdentificacion);

        textFieldIdentificacion = new JTextField();
        textFieldIdentificacion.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                cedula = Double.parseDouble(textFieldIdentificacion.getText());
                cargarDatosPorCedula(cedula);
            }
        });
        textFieldIdentificacion.setBounds(320, 25, 150, 20);
        add(textFieldIdentificacion);
        textFieldIdentificacion.setColumns(10);

        JLabel lblRH = new JLabel("RH:");
        lblRH.setBounds(250, 55, 60, 14);
        add(lblRH);

        textFieldRH = new JTextField();
        textFieldRH.setBounds(320, 52, 150, 20);
        add(textFieldRH);
        textFieldRH.setColumns(10);

        JLabel lblNumero = new JLabel("Celular");
        lblNumero.setBounds(250, 111, 60, 14);
        add(lblNumero);

        textFieldCelular = new JTextField();
        textFieldCelular.setBounds(320, 108, 150, 20);
        add(textFieldCelular);
        textFieldCelular.setColumns(10);

        JButton btnGuardarDatos = new JButton("Guardar Datos");
        btnGuardarDatos.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		guardarDatos();
        	}
        });
        btnGuardarDatos.setBounds(170, 206, 150, 23);
        add(btnGuardarDatos);
        
        JLabel lblDireccion = new JLabel("Direccion");
        lblDireccion.setBounds(10, 83, 60, 14);
        add(lblDireccion);
        
        textFieldDireccion = new JTextField();
        textFieldDireccion.setColumns(10);
        textFieldDireccion.setBounds(80, 80, 150, 20);
        add(textFieldDireccion);
        
        textFieldCorreo = new JTextField();
        textFieldCorreo.setColumns(10);
        textFieldCorreo.setBounds(80, 108, 150, 20);
        add(textFieldCorreo);
        
        JLabel lblCorreo = new JLabel("Correo");
        lblCorreo.setBounds(10, 111, 60, 14);
        add(lblCorreo);
        
        JLabel lblSeguro = new JLabel("Seguro");
        lblSeguro.setBounds(10, 142, 60, 14);
        add(lblSeguro);
        
        textFieldSeguro = new JTextField();
        textFieldSeguro.setColumns(10);
        textFieldSeguro.setBounds(80, 139, 150, 20);
        add(textFieldSeguro);
        
        JLabel lblPensionesCesantias = new JLabel("Pensiones y Cesantias");
        lblPensionesCesantias.setBounds(10, 173, 180, 14);
        add(lblPensionesCesantias);
        
        textFieldCesantias = new JTextField();
        textFieldCesantias.setColumns(10);
        textFieldCesantias.setBounds(204, 170, 266, 20);
        add(textFieldCesantias);
        
        JLabel lblEdad = new JLabel("Edad");
        lblEdad.setBounds(250, 83, 60, 14);
        add(lblEdad);
        
        textFieldEdad = new JTextField();
        textFieldEdad.setColumns(10);
        textFieldEdad.setBounds(320, 80, 150, 20);
        add(textFieldEdad);
    }
	
    // Método para actualizar los campos de texto con los datos de un objeto Trabajador
	public void mostrarDatosTrabajador(Trabajador trabajador) {
	    textFieldNombre.setText(trabajador.getNombres());
	    textFieldApellido.setText(trabajador.getApellidos());
	    textFieldIdentificacion.setText(String.valueOf(trabajador.getIdentificacion()));
	    textFieldDireccion.setText(trabajador.getDireccion());
	    textFieldCorreo.setText(trabajador.getCorreo());
	    textFieldSeguro.setText(trabajador.getSeguro());
	    textFieldCesantias.setText(trabajador.getFondoPensionesCesantias());
	    textFieldRH.setText(trabajador.getRH());
	    textFieldEdad.setText(String.valueOf(trabajador.getEdad()));
	    textFieldCelular.setText(String.valueOf(trabajador.getNumero()));
	}
	private void guardarDatos() {
		for (Trabajador trabajador : listaTrabajadores) {
            if (trabajador.getIdentificacion().equals(cedula)) {
            	//Cedula existente
            	Trabajador P1 = new Trabajador(textFieldNombre.getText(), textFieldApellido.getText(), 
            			textFieldDireccion.getText(), textFieldCorreo.getText(),textFieldSeguro.getText(), textFieldCesantias.getText(), textFieldRH.getText(),
            			Double.parseDouble(textFieldIdentificacion.getText()),Integer.parseInt(textFieldEdad.getText()),Integer.parseInt(textFieldCelular.getText()));
            	listaTrabajadores.add(P1);
            	
            	
                return;
            }
		}
		// Guardar la lista en un archivo de texto
		guardarEnArchivo(listaTrabajadores);
		// Mostrar mensaje de éxito
		JOptionPane.showMessageDialog(this, "Datos guardados correctamente.");
	}

    
    private void guardarEnArchivo(List<Trabajador> lista) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos_trabajadores.txt"))) {
            for (Trabajador trabajador : lista) {
                // Escribir los datos del trabajador en el archivo
                writer.write(trabajador.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            // Manejo de errores de escritura en el archivo
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar los datos.");
        }
    }
    
    //Trae la informacion de una persona o¿por su cedula
    public void cargarDatosPorCedula(double cedula) {
        for (Trabajador trabajador : listaTrabajadores) {
            if (trabajador.getIdentificacion().equals(cedula)) {
                textFieldNombre.setText(trabajador.getNombres());
                textFieldApellido.setText(trabajador.getApellidos());
                textFieldDireccion.setText(trabajador.getDireccion());
                textFieldCorreo.setText(trabajador.getCorreo());
                textFieldSeguro.setText(trabajador.getSeguro());
                textFieldCesantias.setText(trabajador.getFondoPensionesCesantias());
                textFieldRH.setText(trabajador.getRH());
                textFieldEdad.setText(String.valueOf(trabajador.getEdad()));
                textFieldCelular.setText(String.valueOf(trabajador.getNumero()));
                return;
            }
        }
    }

}
