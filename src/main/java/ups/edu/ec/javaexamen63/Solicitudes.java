package ups.edu.ec.javaexamen63;

import java.math.BigDecimal;
import java.util.Date;
import jakarta.persistence.Entity;


public class Solicitudes {
	
	private int id;
	private String cedulaCliente;
	private String nombreCliente;
	private String correoElectronico;
	private Date fecha;
	private int meses;
	private BigDecimal monto;
	
	
	public int getMeses() {
		return meses;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public void setMeses(int meses) {
		this.meses = meses;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCedulaCliente() {
		return cedulaCliente;
	}
	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Solicitudes [id=" + id + ", cedulaCliente=" + cedulaCliente + ", nombreCliente=" + nombreCliente
				+ ", correoElectronico=" + correoElectronico + ", fecha=" + fecha + ", meses=" + meses + ", monto="
				+ monto + "]";
	}
	
}

