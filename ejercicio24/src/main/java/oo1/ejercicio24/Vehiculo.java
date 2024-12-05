package oo1.ejercicio24;

import java.time.*;

public class Vehiculo {
	private Conductor dueño;
	private String descripcion;
	private Year anios;
	private int capacidad;
	private double valor;
	
	public double calcularBonificacion(double monto) {
		return this.valor * 0.001 + monto;
	}
	public int antiguedad() {
		return this.anios.getValue() - LocalDate.now().getYear();
		
	}
	public Conductor getDueño() {
		return dueño;
	}
	public int getCapacidad() {
		return capacidad;
	}
}
