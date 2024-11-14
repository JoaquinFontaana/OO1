package oo1.ejercicio20;

import java.time.*;

import oo1.ejercicio14.DateLapse;

public abstract class Contrato {
	private Empleado empleado;
	private LocalDate inicio;
	
	public Contrato(LocalDate incio,Empleado empleado) {
		this.empleado =empleado;
		this.inicio = inicio;
	}
	public LocalDate getInicio() {
		return inicio;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public abstract boolean activo();
	public abstract double calcularMonto(); 
	public abstract double calcularDuracion();
}
