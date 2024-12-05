package oo1.ejercicio24;

public class Conductor extends Usuario {
	private Vehiculo vehiculo;
	@Override
	public double calcularComision(double monto) {
		if(this.vehiculo.antiguedad() < 5) {
			return monto * 1.01;
		}
		return monto * 1.1;
	}
	@Override
	public double calcularBonificacion(double monto) {
		return this.vehiculo.calcularBonificacion(monto);
	}
	
}
