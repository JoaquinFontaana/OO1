package oo1.ejercicio23;

public class SeisCuotas implements Pago{
	@Override
	public double calcularPrecioFinal(double costo) {
		return costo * 1.20;
	}
}
