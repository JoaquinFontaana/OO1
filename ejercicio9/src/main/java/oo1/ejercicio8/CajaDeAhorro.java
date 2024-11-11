package oo1.ejercicio8;

public class CajaDeAhorro extends Cuenta {
	@Override
	protected boolean puedeExtraer(double monto) {
		monto = monto + monto *0.02;
		return monto <= this.getSaldo();
	}
	
}
