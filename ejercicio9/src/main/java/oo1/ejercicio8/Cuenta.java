package oo1.ejercicio8;

public abstract class Cuenta {
	private double saldo;
	
	public Cuenta() {
		this.saldo = 0;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public boolean extraer(double monto) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		}
		return false;
	}

	public void depositar(double monto) {
		saldo+=monto;
	}
	public boolean transferirACuenta(double monto,Cuenta cuentaDestino) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	protected void extraerSinControlar(double monto) {
		this.saldo -=monto;
	}
	protected abstract boolean puedeExtraer(double monto);
}
