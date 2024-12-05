package oo1.ejercicio24;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Viaje {
	private String origen;
	private String destino;
	private double total;
	private LocalDate fecha;
	private List<Usuario> pasajeros;
	private Vehiculo vehiculo;
	
	public Viaje(String origen,String destino,double total,LocalDate fecha, Vehiculo vehiculo) {
		this.destino = destino;
		this.fecha = fecha;
		this.origen = origen;
		this.total = total;
		this.vehiculo = vehiculo;
		this.pasajeros = new ArrayList<>();
		this.pasajeros.add(this.vehiculo.getDueño());
	}
	
	public void procesarViaje() {
		double monto = this.total/this.pasajeros.size();
		this.pasajeros.stream().forEach(p -> p.procesarViaje(monto));
	}
	
	public void agregarPasajero(Pasajero pasajero) {
		if(this.pasajeros.size() < this.vehiculo.getCapacidad() 
				&& pasajero.tieneSaldo()
				&& Period.between(LocalDate.now(), this.fecha).getDays() >= 2) {
			this.pasajeros.add(pasajero);
			pasajero.registrarViaje(this);
		}
	}
	public LocalDate getFecha() {
		return fecha;
	}
}
