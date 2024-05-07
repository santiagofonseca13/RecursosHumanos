/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago
 */
public class PrestacionesSociales {
    private double cesantias, interesesCesantias, primaVacacional, primaServicios, pension;

    public PrestacionesSociales() {
    }

    public PrestacionesSociales(double cesantias, double interesesCesantias, double primaVacacional, double primaServicios, double pension) {
        this.cesantias = cesantias;
        this.interesesCesantias = interesesCesantias;
        this.primaVacacional = primaVacacional;
        this.primaServicios = primaServicios;
        this.pension = pension;
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

    @Override
    public String toString() {
        return "PrestacionesSociales{" +
                "cesantias=" + cesantias +
                ", interesesCesantias=" + interesesCesantias +
                ", primaVacacional=" + primaVacacional +
                ", primaServicios=" + primaServicios +
                ", pension=" + pension +
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
