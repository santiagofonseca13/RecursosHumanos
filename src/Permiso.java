import java.util.Date;

import javax.swing.JPanel;

public class Permiso extends JPanel {
	
	private String motivo;
    private Date fechaInicio;
    private Date fechaFin;

	/**
	 * Create the panel.
	 */
	public Permiso() {

	}
	
	public Permiso(String motivo, Date fechaInicio, Date fechaFin) {
        this.motivo = motivo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Permiso{" +
                "motivo='" + motivo + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }

}
