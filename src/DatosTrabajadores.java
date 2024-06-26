import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class DatosTrabajadores extends JPanel {
	
	public List<Trabajador> listaTrabajadores = new ArrayList<>();
	public double cedula;
	
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
	
	public main principal;
	
	public DatosTrabajadores(main principal) {
		this();
		this.principal = principal;
	}
	
	public DatosTrabajadores() {
		setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos Personales", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)), "Datos Personales", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		setLayout(null);
		
        cargarDesdeArchivo();
		
		JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(10, 58, 60, 14);
        add(lblNombre);

        textFieldNombre = new JTextField();
        textFieldNombre.setBounds(80, 55, 150, 20);
        add(textFieldNombre);
        textFieldNombre.setColumns(10);

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(10, 83, 60, 14);
        add(lblApellido);

        textFieldApellido = new JTextField();
        textFieldApellido.setBounds(80, 80, 150, 20);
        add(textFieldApellido);
        textFieldApellido.setColumns(10);

        JLabel lblIdentificacion = new JLabel("Identificación:");
        lblIdentificacion.setBounds(131, 27, 80, 14);
        add(lblIdentificacion);

        textFieldIdentificacion = new JTextField();
        textFieldIdentificacion.setBounds(221, 24, 150, 20);
        textFieldIdentificacion.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
        	    principal.tablaEmpleados.LLenarTabla();
            	String textoIdentificacion = textFieldIdentificacion.getText();
            	if (!textoIdentificacion.isEmpty()) {
            	    cedula = Double.parseDouble(textFieldIdentificacion.getText());
            	    principal.interPreSociales.cedula  = Double.parseDouble(textFieldIdentificacion.getText()) ;
            	    cargarDatosPorCedula(cedula);
            	    principal.interPreSociales.cargarDatosPorCedula(principal.interPreSociales.cedula);
            	} else {
            	}
            }
        });
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
        		principal.tablaEmpleados.LLenarTabla();
        	}
        });
        btnGuardarDatos.setBounds(170, 203, 150, 23);
        add(btnGuardarDatos);
        
        JLabel lblDireccion = new JLabel("Direccion");
        lblDireccion.setBounds(10, 111, 60, 14);
        add(lblDireccion);
        
        textFieldDireccion = new JTextField();
        textFieldDireccion.setColumns(10);
        textFieldDireccion.setBounds(80, 108, 150, 20);
        add(textFieldDireccion);
        
        textFieldCorreo = new JTextField();
        textFieldCorreo.setColumns(10);
        textFieldCorreo.setBounds(80, 136, 150, 20);
        add(textFieldCorreo);
        
        JLabel lblCorreo = new JLabel("Correo");
        lblCorreo.setBounds(10, 139, 60, 14);
        add(lblCorreo);
        
        JLabel lblSeguro = new JLabel("Seguro");
        lblSeguro.setBounds(250, 139, 60, 14);
        add(lblSeguro);
        
        textFieldSeguro = new JTextField();
        textFieldSeguro.setColumns(10);
        textFieldSeguro.setBounds(320, 136, 150, 20);
        add(textFieldSeguro);
        
        JLabel lblPensionesCesantias = new JLabel("Pensiones y Cesantias");
        lblPensionesCesantias.setBounds(10, 170, 180, 14);
        add(lblPensionesCesantias);
        
        textFieldCesantias = new JTextField();
        textFieldCesantias.setColumns(10);
        textFieldCesantias.setBounds(204, 167, 266, 20);
        add(textFieldCesantias);
        
        JLabel lblEdad = new JLabel("Edad");
        lblEdad.setBounds(250, 83, 60, 14);
        add(lblEdad);
        
        textFieldEdad = new JTextField();
        textFieldEdad.setColumns(10);
        textFieldEdad.setBounds(320, 80, 150, 20);
        add(textFieldEdad);
    }
	
	public void guardarDatos() {
		boolean encontrado = false;
		for (Trabajador trabajador : listaTrabajadores) {
	        if (trabajador.getIdentificacion() == cedula) {
	            trabajador.setNombres(textFieldNombre.getText());
	            trabajador.setApellidos(textFieldApellido.getText());
	            trabajador.setDireccion(textFieldDireccion.getText());
	            trabajador.setCorreo(textFieldCorreo.getText());
	            trabajador.setSeguro(textFieldSeguro.getText());
	            trabajador.setFondoPensionesCesantias(textFieldCesantias.getText());
	            trabajador.setRH(textFieldRH.getText());
	            trabajador.setEdad(Integer.parseInt(textFieldEdad.getText()));
	            trabajador.setNumero(Integer.parseInt(textFieldCelular.getText()));
	            
	            encontrado = true;
	        	JOptionPane.showMessageDialog(this, "Datos actualizados correctamente.");
	        	break;
	        }
		}
		if (!encontrado) {
	        	Trabajador P5 = new Trabajador(textFieldNombre.getText(), textFieldApellido.getText(), 
	            		textFieldDireccion.getText(), textFieldCorreo.getText(),textFieldSeguro.getText(), textFieldCesantias.getText(), textFieldRH.getText(),
	            		Double.parseDouble(textFieldIdentificacion.getText()),Integer.parseInt(textFieldEdad.getText()),Integer.parseInt(textFieldCelular.getText()));
	        	listaTrabajadores.add(P5);
	        	JOptionPane.showMessageDialog(this, "Datos guardados correctamente.");
	        	}
		guardarEnArchivo();
	}

	
	public Trabajador buscarTrabajadorPorCedula() {
        for (Trabajador trabajador : listaTrabajadores) {
            if (trabajador.getIdentificacion() == cedula) {
                return trabajador;
            }
        }
        return null;
    }

	public void guardarEnArchivo() {
        try (BufferedWriter escribir = new BufferedWriter(new FileWriter("datos_trabajadores.txt"))) {
        	escribir.write("");
            for (Trabajador trabajador : listaTrabajadores) {
            	escribir.write(trabajador.getNombres()+"\t"+
            			trabajador.getApellidos()+"\t"+
            			trabajador.getDireccion()+"\t"+
            			trabajador.getCorreo()+"\t"+
            			trabajador.getSeguro()+"\t"+
            			trabajador.getFondoPensionesCesantias()+"\t"+
            			trabajador.getRH()+"\t"+
            			trabajador.getIdentificacion()+"\t"+
            			trabajador.getEdad()+"\t"+
            			trabajador.getNumero());
            	escribir.newLine();
            }
            escribir.close();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar los datos.");
        }
    }
    
    public void cargarDesdeArchivo() {
        try (BufferedReader leer = new BufferedReader(new FileReader("datos_trabajadores.txt"))) {
            String linea="";
            while ((linea = leer.readLine()) != null) {
                String[] datos = linea.split("\t");
                if (datos.length == 10) {
                    String nombre = datos[0];
                    String apellido = datos[1];
                    String direccion = datos[2];
                    String correo = datos[3];
                    String seguro = datos[4];
                    String fondoPensionesCesantias = datos[5];
                    String RH = datos[6];
                    double identificacion = Double.parseDouble(datos[7]);
                    int edad = Integer.parseInt(datos[8]);
                    int numero = Integer.parseInt(datos[9]);

                    Trabajador trabajador = new Trabajador(nombre, apellido, direccion, correo, seguro, fondoPensionesCesantias, 
                    		RH, identificacion,edad, numero);
                    listaTrabajadores.add(trabajador);
                }
            }
        } catch (IOException e) {
           System.out.println("Error al leer el archivo");
        }
    }
    
    
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
	    limpiarCampos();
    }
    
    private void limpiarCampos() {
    	textFieldNombre.setText("");
    	textFieldApellido.setText("");
    	textFieldDireccion.setText("");
    	textFieldCorreo.setText("");
    	textFieldSeguro.setText("");
    	textFieldCesantias.setText("");
    	textFieldRH.setText("");
    	textFieldEdad.setText("");
    	textFieldCelular.setText("");
	}
    
    public List<Trabajador> getLista(){
    	return listaTrabajadores;
    }	
}
