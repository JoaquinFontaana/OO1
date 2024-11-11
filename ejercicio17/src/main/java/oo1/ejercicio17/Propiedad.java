package oo1.ejercicio17;

import java.time.*;
import java.util.ArrayList;

public class Propiedad {
	private String nombre;
	private String direccion;
	private Double precioPorNoche;
	private ArrayList<Reserva> reservas;
	
	public Propiedad(String nombre,String direccion,double precioPorNoche) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.precioPorNoche = precioPorNoche;
		this.reservas = new ArrayList<>();
	}
	public Double getPrecioPorNoche() {
		return precioPorNoche;
	}
	public void setPrecioPorNoche(Double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}
	public Reserva crearReserva(LocalDate from,LocalDate to) {
		if(this.consultarDisponibilidad(from, to)) {
			Reserva reserva = new Reserva(from,to,this);
			this.reservas.add(reserva);
			return reserva;
		}
		return null;
	}
	public double calcularIngresos() {
		return this.reservas.stream().mapToDouble(r -> r.calcularPrecio()).sum();
	}
	public boolean consultarDisponibilidad(LocalDate from,LocalDate to) {
		return this.reservas.stream().allMatch(r -> r.consultarDisponibilidad(from, to));
	}
	public boolean cancelarReserva(Reserva reserva){
		if(!reserva.estaActiva()) {
			return this.reservas.remove(reserva);
		}
		return false;
	}
	public ArrayList<Reserva> getReservas() {
		return reservas;
	}
}