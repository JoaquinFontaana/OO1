package oo1.ejercicio13;

import java.util.*;

public class Carpeta {
	private ArrayList<Email> emails;
	private String nombre;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<>();
	}
	
	public void agregarEmail(Email email) {
		this.emails.add(email);
	}
	public int getCantidadEmails() {
		return emails.size();
	}
	public void mover(Email email,Carpeta destino) {
		this.emails.remove(email);
		destino.agregarEmail(email);
	}
	public String getNombre() {
		return nombre;
	}
	public Email buscar(String texto) {
		return this.emails.stream().filter(e -> e.buscar(texto)).findFirst().orElse(null);
	}
	public int calcularTamaño() {
		return this.emails.stream().mapToInt(e -> e.calcularTamaño()).sum();
	}
}
