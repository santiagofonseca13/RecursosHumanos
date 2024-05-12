import javax.swing.JPanel;

public class PrestacionesSociales extends JPanel {
	private double cesantias, interesesCesantias, primaVacacional, primaServicios, pension, salario, fechaInicio, fechaVacaciones;
	private String contrato;
	/**
	 * Create the panel.
	 */
	public PrestacionesSociales() {

	}
	public PrestacionesSociales(double cesantias, double interesesCesantias, double primaVacacional, double primaServicios, double pension, double salario, double fechaInicio, double fechaVacaciones, String contrato) {
        this.cesantias = cesantias;
        this.interesesCesantias = interesesCesantias;
        this.primaVacacional = primaVacacional;
        this.primaServicios = primaServicios;
        this.pension = pension;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
        this.fechaVacaciones = fechaVacaciones;
        this.contrato = contrato;
    }

    public double getCesantias() {
        return cesantias;
    }

    public void setCesantias(double cesantias) {
        this.cesantias = cesantias;
    }

    public double getInteresesCesantias() {
        return interesesCesantias;
    }

    public void setInteresesCesantias(double interesesCesantias) {
        this.interesesCesantias = interesesCesantias;
    }

    public double getPrimaVacacional() {
        return primaVacacional;
    }

    public void setPrimaVacacional(double primaVacacional) {
        this.primaVacacional = primaVacacional;
    }

    public double getPrimaServicios() {
        return primaServicios;
    }

    public void setPrimaServicios(double primaServicios) {
        this.primaServicios = primaServicios;
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
    
    public void setSalario (double salario) {
    	this.salario = salario;
    }
    
    public double getFechaInicio () {
    	return fechaInicio;
    }
    
    public void setFechaInicio (double fechaInicio) {
    	this.fechaInicio = fechaInicio;
    }
    
    public double getFechaVacaciones () {
    	return fechaVacaciones;
    }
    
    public void setFechaVacaciones (double fechaVacaciones) {
    	this.fechaVacaciones = fechaVacaciones;
    }
    
    public String getContrato() {
    	return contrato;
    }
    
    public void setContrato (String contrato) {
    	this.contrato = contrato;
    }

    @Override
    public String toString() {
        return "PrestacionesSociales{" +
                "cesantias=" + cesantias +
                ", interesesCesantias=" + interesesCesantias +
                ", primaVacacional=" + primaVacacional +
                ", primaServicios=" + primaServicios +
                ", pension=" + pension +
                ", salario=" + salario +
                ", fechaInicio=" + fechaInicio +
                ", fechaVacaciones=" + fechaVacaciones +
                ", contrato=" + contrato +
                '}';
    }

    // Metodos Adicionales
    public static double calcularCesantias(double salarioBase) {
        // Supongamos que las cesantías son el 8% del salario base
        return salarioBase * 0.08;
    }

    public static double calcularInteresesCesantias(double cesantias) {
        // Supongamos que los intereses sobre cesantías son el 12% de las cesantías acumuladas
        return cesantias * 0.12;
    }
    
    public void calcularPension(double salarioBase) {
        // Supongamos que la contribución a la pensión es el 10% del salario base
        this.pension = salarioBase * 0.10;
    }
}
