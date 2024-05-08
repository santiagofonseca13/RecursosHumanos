import javax.swing.JPanel;

public class Cargo extends JPanel {
	
	private String nombre;
    private double salario;

	public Cargo() {

	}
	
	public Cargo(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }

}
