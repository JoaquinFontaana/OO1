package oo1.ejercicio24;

import java.util.List;

public abstract class Usuario {
	private String nombre;
	private double saldo;
	
	
	public void procesarViaje(double monto) {
		this.saldo -= this.calcularBonificacion(monto);
	}
	
	public abstract double calcularBonificacion(double monto);
	
	public void cargarSaldo(double monto) {
		this.saldo += this.calcularComision(monto);
	}
	
	public abstract double calcularComision(double monto);
	
	public double getSaldo() {
		return saldo;
	}
}
