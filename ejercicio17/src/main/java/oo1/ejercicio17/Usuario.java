package oo1.ejercicio17;

import java.time.*;
import java.util.*;

public class Usuario {
	private String nombre;
	private String direccion;
	private ArrayList<Propiedad> propiedades;
	private ArrayList<Reserva> reservas;
	
	public Usuario(String nombre,String direccion) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.propiedades = new ArrayList<>();
		this.reservas = new ArrayList<>();
	}
	public void reservar(LocalDate from,LocalDate to,Propiedad propiedad) {
		Reserva r= propiedad.crearReserva(from, to);
		if(r != null) {
			this.reservas.add(r);
		}
	}
	public double calcularIngresos() {
		return this.propiedades.stream().mapToDouble(p -> p.calcularIngresos()).sum();
	}
}
