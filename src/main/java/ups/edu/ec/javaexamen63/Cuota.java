package ups.edu.ec.javaexamen63;

import java.math.BigDecimal;

public class Cuota {
	
	private int numeroCuota;
    private BigDecimal cuotaCapital;
    private BigDecimal cuotaInteres;
    private BigDecimal cuotaTotal;
    
    
	public int getNumeroCuota() {
		return numeroCuota;
	}
	public void setNumeroCuota(int numeroCuota) {
		this.numeroCuota = numeroCuota;
	}
	public BigDecimal getCuotaCapital() {
		return cuotaCapital;
	}
	public void setCuotaCapital(BigDecimal cuotaCapital) {
		this.cuotaCapital = cuotaCapital;
	}
	public BigDecimal getCuotaInteres() {
		return cuotaInteres;
	}
	public void setCuotaInteres(BigDecimal cuotaInteres) {
		this.cuotaInteres = cuotaInteres;
	}
	public BigDecimal getCuotaTotal() {
		return cuotaTotal;
	}
	public void setCuotaTotal(BigDecimal cuotaTotal) {
		this.cuotaTotal = cuotaTotal;
	}
	public Cuota() {
		super();
		this.numeroCuota = numeroCuota;
		this.cuotaCapital = cuotaCapital;
		this.cuotaInteres = cuotaInteres;
		this.cuotaTotal = cuotaTotal;
	} 

}
