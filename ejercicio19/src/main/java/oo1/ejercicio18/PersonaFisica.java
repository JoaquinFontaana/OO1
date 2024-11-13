package oo1.ejercicio18;

import java.time.LocalDate;

import oo1.ejercicio14.DateLapse;

public class PersonaFisica extends Cliente{
	private String dni;
	
	public PersonaFisica(String nombre,String direccion,String dni) {
		super(nombre,direccion);
		this.dni = dni;
	}
	
	@Override
	public double montoPagar(LocalDate to, LocalDate from) {
		DateLapse periodo = new DateLapse(from,to);
		return 0.9 * this.getEnvios().stream()
				.filter(e -> periodo.includesDate(e.getFechaDespacho()))
				.mapToDouble(e -> e.calcularCosto())
				.sum();
	}
}
