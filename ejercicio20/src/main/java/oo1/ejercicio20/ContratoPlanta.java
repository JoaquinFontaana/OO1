package oo1.ejercicio20;

import java.time.*;
import java.time.temporal.ChronoUnit;

import oo1.ejercicio14.DateLapse;

public class ContratoPlanta extends Contrato{
	private double sueldo;
	private double montoConyuge;
	private double montoHijos;
	
	public ContratoPlanta(LocalDate inicio,Empleado empleado,double sueldo,double montoConyuge,double montoHijos) {
		super(inicio, empleado);
		this.sueldo = sueldo;
		this.montoConyuge = montoConyuge;
		this.montoHijos = montoHijos;
	}
	@Override
	public boolean activo() {
		return true;
	}
	@Override
	public double calcularMonto() {
		double hijos= 0;
		double conyuge = 0;
		double adicional = this.getEmpleado().calcularAdicionalAntiguedad();
		if(this.getEmpleado().getHijos()) {
			hijos = this.montoHijos;
		}
		if(this.getEmpleado().isConyuge()) {
			conyuge = this.montoConyuge;
		}
		return adicional * (this.sueldo + hijos + conyuge);
	}
	@Override
	public double calcularDuracion() {
		return this.getInicio().minusDays(1).until(LocalDate.now(), ChronoUnit.YEARS);
	}
}
