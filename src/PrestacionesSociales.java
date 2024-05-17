import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JPanel;

public class PrestacionesSociales extends JPanel {
	private double identificacion, cesantias, prima, pension, salario;
	private String contrato, fechaInicio, fechaVacaciones, cargo;
	/**
	 * Create the panel.
	 */
	public PrestacionesSociales() {

	}

    public PrestacionesSociales(double identificacion, double cesantias, double prima, double pension, double salario, String contrato, String fechaInicio, String fechaVacaciones, String cargo) {
        this.identificacion = identificacion;
        this.cesantias = cesantias;
        this.prima = prima;
        this.pension = pension;
        this.salario = salario;
        this.contrato = contrato;
        this.fechaInicio = fechaInicio;
        this.fechaVacaciones = fechaVacaciones;
        this.cargo = cargo;
    }

    public double getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(double identificacion) {
        this.identificacion = identificacion;
    }

    public double getCesantias() {
        return cesantias;
    }

    public void setCesantias(double cesantias) {
        this.cesantias = cesantias;
    }

    public double getPrima() {
        return prima;
    }

    public void setPrima(double prima) {
        this.prima = prima;
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaVacaciones() {
        return fechaVacaciones;
    }

    public void setFechaVacaciones(String fechaVacaciones) {
        this.fechaVacaciones = fechaVacaciones;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Metodos Adicionales
    public static double calcularCesantias(double salarioBase) {
        // Supongamos que las cesantías son el 8% del salario base
        return salarioBase * 0.08;
    }
    
    public static double calcularPrima(double salarioBase) {
        // Calcula la prima basada en el salario del empleado
        return salarioBase * 0.0833;
    }

    public static double calcularInteresesCesantias(double cesantias) {
        // Supongamos que los intereses sobre cesantías son el 12% de las cesantías acumuladas
        return cesantias * 0.12;
    }
    
    public static double calcularPension(double salarioBase) {
        // Supongamos que la contribución a la pensión es el 10% del salario base
        return salarioBase * 0.10;
    }

    public void calcularDiasVacaciones(String fechaInicio, String fechaVacaciones) {
        
    }
}