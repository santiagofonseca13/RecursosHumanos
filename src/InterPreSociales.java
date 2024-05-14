import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

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
    public JComboBox<String> comboBox;
    
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
        
        comboBox = new JComboBox<>();
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cargoSeleccionado = (String) comboBox.getSelectedItem();
                if (!cargoSeleccionado.equals("Seleccione")) {
                    switch (cargoSeleccionado) {
                        case "Administrador":
                            textFieldSalario.setText("3000000"); // Definir salario para Administrador
                            break;
                        case "Contador":
                            textFieldSalario.setText("2800000"); // Definir salario para Contador
                            break;
                        case "Secretario":
                            textFieldSalario.setText("1900000"); // Definir salario para Secretario
                            break;
                        case "Vigilante":
                            textFieldSalario.setText("1700000"); // Definir salario para Vigilante
                            break;
                        case "Asesor":
                            textFieldSalario.setText("1800000"); // Definir salario para Asesor
                            break;
                    }
                    calcularPrestaciones(Double.parseDouble(textFieldSalario.getText())); // Calcular prestaciones
                } else {
                }
            }
        });
        comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Seleccione:", "Administrador", "Contador", "Secretario", "Vigilante", "Asesor"}));
        comboBox.setToolTipText("");
        comboBox.setBounds(159, 23, 329, 22);
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
        lblSalario.setBounds(10, 148, 58, 20);
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
        textFieldContrato.setBounds(159, 55, 329, 20);
        add(textFieldContrato);

        textFieldSalario = new JTextField();
        textFieldSalario.setColumns(10);
        textFieldSalario.setBounds(159, 148, 150, 20);
        add(textFieldSalario);
        
      
        textFieldPensiones = new JTextField();
        textFieldPensiones.setColumns(10);
        textFieldPensiones.setBounds(159, 240, 329, 20);
        textFieldPensiones.setEditable(false);
        add(textFieldPensiones);
        
        textFieldFechaInicio = new JTextField();
        textFieldFechaInicio.setColumns(10);
        textFieldFechaInicio.setBounds(159, 86, 329, 20);
        add(textFieldFechaInicio);
        
        textFieldFechaVacaciones = new JTextField();
        textFieldFechaVacaciones.setColumns(10);
        textFieldFechaVacaciones.setBounds(159, 117, 329, 20);
        add(textFieldFechaVacaciones);
        
        textFieldCesantias = new JTextField();
        textFieldCesantias.setColumns(10);
        textFieldCesantias.setBounds(159, 179, 329, 20);
        textFieldCesantias.setEditable(false); 
        add(textFieldCesantias);

        textFieldVacaciones = new JTextField();
        textFieldVacaciones.setColumns(10);
        textFieldVacaciones.setBounds(159, 271, 329, 20);
        textFieldVacaciones.setEditable(false); 
        add(textFieldVacaciones);

        textFieldPrima = new JTextField();
        textFieldPrima.setColumns(10);
        textFieldPrima.setBounds(159, 210, 329, 20);
        textFieldPrima.setEditable(false); 
        add(textFieldPrima);

        JButton btnGuardar = new JButton("Guardar");

        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarDatos();
            }
        });
        btnGuardar.setBounds(403, 302, 85, 23);
        add(btnGuardar);

        JButton btnCalcular = new JButton("Calcular Prestaciones");
        btnCalcular.setHorizontalAlignment(SwingConstants.LEADING);
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!textFieldSalario.getText().isEmpty()) {
                    double salario = Double.parseDouble(textFieldSalario.getText());
                    calcularPrestaciones(salario);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un salario antes de calcular las prestaciones.");
                }
            }
        });
        btnCalcular.setBounds(321, 147, 167, 23);
        add(btnCalcular);

        textFieldSalario.setText("0"); 
        textFieldFechaInicio.setText("0"); 
        textFieldFechaVacaciones.setText("0"); 
        textFieldCesantias.setText("0");
        textFieldPensiones.setText("0");
        textFieldVacaciones.setText("0");
        textFieldPrima.setText("0");
        
        calcularPrestaciones(0); // Inicializar con valores por defecto
    }

    private void calcularPrestaciones(double salarioBase) {
        textFieldCesantias.setText(String.valueOf(PrestacionesSociales.calcularCesantias(salarioBase)));
        textFieldPrima.setText(String.valueOf(PrestacionesSociales.calcularPrima(salarioBase)));
        textFieldPensiones.setText(String.valueOf(PrestacionesSociales.calcularPension(salarioBase)));
    }
    
    public void guardarDatos() {
        boolean encontrado = false;
        for (PrestacionesSociales prestaciones : DatosPres) {
            if (prestaciones.getIdentificacion() == cedula) {
                prestaciones.setCargo(cargo);
                prestaciones.setCesantias(Double.parseDouble(textFieldCesantias.getText()));
                prestaciones.setVacacional(Double.parseDouble(textFieldVacaciones.getText()));                    
                prestaciones.setPrima(Double.parseDouble(textFieldPrima.getText()));
                prestaciones.setPension(Double.parseDouble(textFieldPensiones.getText()));
                prestaciones.setSalario(Double.parseDouble(textFieldSalario.getText()));
                prestaciones.setContrato(textFieldContrato.getText());                      
                prestaciones.setFechaInicio(textFieldFechaInicio.getText());
                prestaciones.setFechaVacaciones(textFieldFechaVacaciones.getText());
                encontrado = true;
                JOptionPane.showMessageDialog(this, "Datos actualizados correctamente.");
                break;
            }
        }
        if (!encontrado) {
            PrestacionesSociales prestaciones = new PrestacionesSociales(
                    cedula,Double.parseDouble(textFieldCesantias.getText()),
                    Double.parseDouble(textFieldVacaciones.getText()),
                    Double.parseDouble(textFieldPrima.getText()),
                    Double.parseDouble(textFieldPensiones.getText()),
                    Double.parseDouble(textFieldSalario.getText()),
                    textFieldContrato.getText(),
                    textFieldFechaInicio.getText(),
                    textFieldFechaVacaciones.getText(), cargo);
            DatosPres.add(prestaciones);
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente.");
        }
        guardarEnArchivo();
    }

    public void guardarEnArchivo() {
         try (BufferedWriter escribir = new BufferedWriter(new FileWriter("PrestacionesSociales.txt"))) {
                escribir.write("");
                for (PrestacionesSociales prestaciones : DatosPres) {
                    escribir.write(prestaciones.getIdentificacion()+"\t"+
                            prestaciones.getCesantias()+"\t"+
                            prestaciones.getVacacional()+"\t"+
                            prestaciones.getPrima()+"\t"+
                            prestaciones.getPension()+"\t"+
                            prestaciones.getSalario()+"\t"+
                            prestaciones.getContrato()+"\t"+
                            prestaciones.getFechaInicio()+"\t"+
                            prestaciones.getFechaVacaciones()+"\t"+
                            prestaciones.getCargo());
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

