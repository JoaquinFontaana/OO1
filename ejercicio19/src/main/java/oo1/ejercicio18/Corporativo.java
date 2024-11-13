package oo1.ejercicio18;

import java.time.LocalDate;

import oo1.ejercicio14.DateLapse;

public class Corporativo extends Cliente{
	private String cuit;
	public Corporativo(String nombre,String direccion,String cuit) {
		super(nombre,direccion);
		this.cuit = cuit;
	}
	@Override
	public double montoPagar(LocalDate to, LocalDate from) {
		DateLapse periodo = new DateLapse(from,to);
		return this.getEnvios().stream()
				.filter(e -> periodo.includesDate(e.getFechaDespacho()))
				.mapToDouble(e -> e.calcularCosto())
				.sum();
	}
}
