import javax.swing.JPanel;

public class Empresa extends JPanel {

    private Trabajador Trabajador = new Trabajador ();

	public Empresa() {

	}
	
	public Trabajador getTrabajador() {
        return Trabajador;
    }

}
