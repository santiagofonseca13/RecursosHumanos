import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Trabajador extends JPanel {

	/**
	 * Create the panel.
	 */
	private String Nombres, Apellidos, Direccion, Correo, Seguro, FondoPensionesCesantias, RH;
    private Double Identificacion;
    private int Edad, Numero;
    
    public main principal;
	
	public Trabajador(main principal) {
		this();
		this.principal = principal;
	}

    public Trabajador() {
    	setBorder(new TitledBorder(null, "Linea 1", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, Color.RED));
		setLayout(null);
    }

    public Trabajador(String nombres, String apellidos, String direccion, String correo, String seguro, String fondoPensionesCesantias, String RH, Double identificacion, int edad, int numero) {
        Nombres = nombres;
        Apellidos = apellidos;
        Direccion = direccion;
        Correo = correo;
        Seguro = seguro;
        FondoPensionesCesantias = fondoPensionesCesantias;
        this.RH = RH;
        Identificacion = identificacion;
        Edad = edad;
        Numero = numero;
    }

	public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getSeguro() {
        return Seguro;
    }

    public void setSeguro(String seguro) {
        Seguro = seguro;
    }

    public String getFondoPensionesCesantias() {
        return FondoPensionesCesantias;
    }

    public void setFondoPensionesCesantias(String fondoPensionesCesantias) {
        FondoPensionesCesantias = fondoPensionesCesantias;
    }

    public String getRH() {
        return RH;
    }

    public void setRH(String RH) {
        this.RH = RH;
    }

    public Double getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(Double identificacion) {
        Identificacion = identificacion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "Nombres='" + Nombres + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", Correo='" + Correo + '\'' +
                ", Seguro='" + Seguro + '\'' +
                ", FondoPensionesCesantias='" + FondoPensionesCesantias + '\'' +
                ", RH='" + RH + '\'' +
                ", Identificacion=" + Identificacion +
                ", Edad=" + Edad +
                ", Numero=" + Numero +
                '}';
    }

	public char[] getSalario() {
		// TODO Auto-generated method stub
		return null;
	}
}
