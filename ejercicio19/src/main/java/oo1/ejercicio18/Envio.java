package oo1.ejercicio18;

import java.time.*;

public abstract class Envio {
	private LocalDate fechaDespacho;
	private String origen;
	private String destino;
	private double peso;
	
	protected Envio(String origen,String destino,double peso) {
		this.destino =destino;
		this.origen = origen;
		this.peso = peso;
	}
	
	public abstract double calcularCosto();
	
	public LocalDate getFechaDespacho() {
		return fechaDespacho;
	}
	protected double getPeso() {
		return peso;
	}
}
