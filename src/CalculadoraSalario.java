import javax.swing.JPanel;

public class CalculadoraSalario extends JPanel {

	/**
	 * Create the panel.
	 */
	public CalculadoraSalario() {

	}
	
	public static double calcularSalarioNeto(double salarioBase, double deducciones, double bonificaciones, int faltas, int diasVacaciones) {
        double salarioNeto = salarioBase + bonificaciones - deducciones;
        double deduccionesFaltas = calcularDeduccionesPorFaltas(salarioBase, faltas);
        double deduccionesVacaciones = calcularDeduccionesPorVacaciones(salarioBase, diasVacaciones);
        salarioNeto -= deduccionesFaltas + deduccionesVacaciones;
        return salarioNeto;
    }

    private static double calcularDeduccionesPorFaltas(double salarioBase, int faltas) {
        // Supongamos que cada falta equivale a un descuento del 1% del salario base
        return salarioBase * 0.01 * faltas;
    }

    private static double calcularDeduccionesPorVacaciones(double salarioBase, int diasVacaciones) {
        // Supongamos que cada día de vacaciones equivale a un descuento del 0.5% del salario base
        return salarioBase * 0.005 * diasVacaciones;
    }

}
