package oo1.ejercicio18;

import java.time.*;
import java.util.*;

public abstract class Cliente {
	private String nombre;
	private String direccion;
	private List<Envio> envios;
	
	public Cliente(String nombre,String direccion) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.envios = new ArrayList<>();
	}
	
	public abstract double montoPagar(LocalDate to,LocalDate from);
	
	public void agregarEnvio(Envio envio) {
		this.envios.add(envio);
	}
	protected List<Envio> getEnvios() {
		return envios;
	}
}
