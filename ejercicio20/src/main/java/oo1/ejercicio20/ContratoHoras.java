package oo1.ejercicio20;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContratoHoras extends Contrato{
	private double valorHora;
	private int horas;
	private LocalDate fin;
	
	public ContratoHoras(LocalDate inicio,Empleado empleado,double valorHora,int horas,LocalDate fin) {
		super(inicio, empleado);
		this.fin = fin;
		this.horas = horas;
		this.valorHora = valorHora;
	}
	
	@Override
	public boolean activo() {
		return this.fin.isBefore(LocalDate.now());
	}
	@Override
	public double calcularMonto() {
		return this.getEmpleado().calcularAdicionalAntiguedad() * (this.valorHora * this.horas);
	}
	@Override
	public double calcularDuracion() {
		//Resto un dia a la fecha de inicio porque el metodo exlcuye el ultmo dia
		if(this.activo()) {
			return this.getInicio().minusDays(1).until(LocalDate.now(), ChronoUnit.YEARS);
		}
		return this.getInicio().minusDays(1).until(this.fin, ChronoUnit.YEARS);
	}
}
