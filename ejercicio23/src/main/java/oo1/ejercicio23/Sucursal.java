package oo1.ejercicio23;

public class Sucursal extends Envio{
	private double precio;
	
	public Sucursal() {
		this.precio = 3000;
	}
	
	@Override
	public double calcularCosto() {
		return this.precio;
	}
}
