package oo1.ejercicio17;
import java.time.*;

import oo1.ejercicio14.*;
public class Reserva {
	private DateLapse periodo;
	private Propiedad propiedad;
	public Reserva(LocalDate from,LocalDate to,Propiedad propiedad){
		periodo = new DateLapse(from, to);
		this.propiedad = propiedad;
	}
	public boolean consultarDisponibilidad(LocalDate from, LocalDate to) {
		return this.periodo.includesDate(from) || this.periodo.includesDate(to);
	}
	public double calcularPrecio() {
		return this.propiedad.getPrecioPorNoche() * this.periodo.sizeInDays();
	}
	public boolean estaActiva() {
		return this.periodo.includesDate(LocalDate.now());
	}
	public LocalDate getFrom() {
		return periodo.getFrom();
	}
}
