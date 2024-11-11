package oo1.ejercicio11;

import java.time.*;

public class PlazoFijo implements Inversion {
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(double montoDepositado,double porcentajeDeInteresDiario) {
		this.fechaDeConstitucion = LocalDate.now();
		this.montoDepositado= montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}
	public PlazoFijo(double montoDepositado,double porcentajeDeInteresDiario,LocalDate fechaDeConstitucion) {
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado= montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}
	@Override
	public double valorActual() {
		int dias = this.calcularDias();
		double p= porcentajeDeInteresDiario/100;
		return montoDepositado * Math.pow(1 + p, dias);
	}
	private int calcularDias() {
		Period periodo = Period.between(fechaDeConstitucion, LocalDate.now());
		return periodo.getDays();
	}
}
