package oo1.ejercicio8;

public class CuentaCorriente extends Cuenta{
	private double limiteDescubierto;
	public CuentaCorriente() {
		super();
		this.limiteDescubierto = 0;
	}
	public void setLimiteDescubierto(double limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}
	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}
	@Override
	protected boolean puedeExtraer(double monto) {
		return ((this.getSaldo() - monto) >= this.limiteDescubierto);
	}
}
